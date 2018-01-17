package com.mytests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLConverter
{

	private static String	AFA_NODE_NAME			= "Afa";
	private static String	CONSIGN_PROC_NODE_NAME	= "Consignment.Proc";
	private static String	MS_APPLICABLE_NODE_NAME	= "Ms.Applicable";
	private static String	GOOD_DETAIL_NODE_NAME	= "Good_Detail";
	private static String	CONFIDENTIAL_NODE_NAME	= "Confidential";

	private static Logger	LOG						= Logger.getLogger(XMLConverter.class);

	public byte[] convertXML(byte[] xmlByteArray)
	{

		LOG.info("Processing xml byte array");

		final TransformerFactory transformerFactory = TransformerFactory.newInstance();

		try
		{
			final DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			docFactory.setNamespaceAware(true);
			final DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			final Document doc = docBuilder.parse(new ByteArrayInputStream(xmlByteArray));
			final String nsPrefix = doc.getDocumentElement().getPrefix() + ":";
			LOG.info("\tNamespace principale: " + nsPrefix);

			// ELIMINAZIONE NODO COSIGNMENT.PROC DA AFA
			final Node afaType = doc.getElementsByTagName(nsPrefix + AFA_NODE_NAME).item(0);

			final NodeList afaTypeChilds = afaType.getChildNodes();

			for (int i = 0; i < afaTypeChilds.getLength(); i++)
			{

				final Node childNode = afaTypeChilds.item(i);

				if ((nsPrefix + CONSIGN_PROC_NODE_NAME).equals(childNode.getNodeName()))
				{
					LOG.info("\tNodo ConsigmentProc trovato. Rimozione");
					afaType.removeChild(childNode);
					break;
				}
			}

			// AGGIUNTA NODO CONSIGNMENT.PROC AGLI MS.APPLICABLE
			final NodeList msApplicableNodeList = doc.getElementsByTagName(nsPrefix + MS_APPLICABLE_NODE_NAME);

			// iteriamo i nodi
			for (int i = 0; i < msApplicableNodeList.getLength(); i++)
			{
				// Nodo Ms.Applicable
				final Node msApplicableNode = msApplicableNodeList.item(i);
				// crea l'elemento nuovo
				final Element consignProc = doc.createElement(nsPrefix + CONSIGN_PROC_NODE_NAME);
				consignProc.appendChild(doc.createTextNode("0"));
				LOG.info("\tAppend dell'elemento ConsignmentProc");
				msApplicableNode.appendChild(consignProc);
			}

			// AGGIUNTA NODO CONFIDENTIAL AI GOOD_DETAIL

			final NodeList goodDetailNodeList = doc.getElementsByTagName(nsPrefix + GOOD_DETAIL_NODE_NAME);
			// iteriamo i nodi
			for (int i = 0; i < goodDetailNodeList.getLength(); i++)
			{
				// Nodo Good_Detail
				final Node goodDetailNode = goodDetailNodeList.item(i);
				// crea l'elemento nuovo
				final Element confidential = doc.createElement(nsPrefix + CONFIDENTIAL_NODE_NAME);
				confidential.appendChild(doc.createTextNode("0"));
				LOG.info("\tAppend dell'elemento Confidential");
				goodDetailNode.appendChild(confidential);
			}

			// write the content into xml file

			final DOMSource source = new DOMSource(doc);
			final ByteArrayOutputStream out = new ByteArrayOutputStream();
			final StreamResult result = new StreamResult(out);
			final Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(source, result);
			LOG.info("\tXml processato.");

			return out.toByteArray();

		}
		catch (final ParserConfigurationException pce)
		{
			pce.printStackTrace();
		}
		catch (final TransformerException tfe)
		{
			tfe.printStackTrace();
		}
		catch (final IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch (final SAXException sae)
		{
			sae.printStackTrace();
		}

		return null;
	}
}
