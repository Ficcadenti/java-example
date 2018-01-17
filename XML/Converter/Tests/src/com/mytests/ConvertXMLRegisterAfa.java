package com.mytests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ConvertXMLRegisterAfa
{

	private static String	basePath	= "D:\\Sviluppo\\Progetti\\git\\Converter\\registerafatest\\";

	private static Logger	LOG			= Logger.getLogger(ConvertXMLRegisterAfa.class);

	public static void main(String argv[])
	{

		PropertyConfigurator.configure("log4j.properties");

		final String[] xmlNames = new String[] { "afa_immenso", "registerafa", "registerafa2", "registerafa3" };

		final XMLConverter xmlConv = new XMLConverter();

		for (final String xmlName : xmlNames)
		{

			byte[] xmlByteArray;
			try
			{
				xmlByteArray = Files.readAllBytes(Paths.get(basePath + xmlName + ".xml"));
				final byte[] convertedByteArray = xmlConv.convertXML(xmlByteArray);
				Files.write(Paths.get(basePath + "converted\\" + xmlName + "_conv.xml"), convertedByteArray);
			}
			catch (final IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
