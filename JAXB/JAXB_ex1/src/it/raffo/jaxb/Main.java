package it.raffo.jaxb;


//import java.io.StringWriter;
//
//import javax.xml.bind.JAXB;
//
//import it.raffo.jaxb.bean.Libro;
//import it.raffo.jaxb.bean.Utente;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println ("JAXB - Test v 1.0");
//
//		Utente u=new Utente();
//		u.setId((long) 10);
//		u.setName("Raffaele");
//		u.setEmail("raffaele.ficcadenti@gmail.com");
//
//		Libro lib1=new Libro();
//		lib1.setAutore("Charles Bukowski");
//		lib1.setTitolo("Musica per organi caldi.");
//		u.getLibri().add(lib1);
//
//		Libro lib2=new Libro();
//		lib2.setAutore("Charles Bukowski");
//		lib2.setTitolo("Panino al prosciutto.");
//		u.getLibri().add(lib2);
//
//		StringWriter sw=new StringWriter();
//		JAXB.marshal(u, sw);
//		System.out.println(sw.toString());
//
//
//	}
//
//
//}

import java.io.File;

import javax.xml.namespace.QName;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.stream.StreamResult;

import jlibs.xml.sax.XMLDocument;
import jlibs.xml.xsd.XSInstance;
import jlibs.xml.xsd.XSParser;

import org.apache.xerces.xs.XSModel;

/**
 * 
 * @author asustya
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws TransformerConfigurationException 
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws TransformerConfigurationException {

		//Obtain files from specified folder
		File[] samplexsd = new File("D:\\temp\\accordo_xsd.xsd").listFiles();

		//Create resulting folder
		if(!new File("SampleXML").exists()) new File("SampleXML").mkdir();

		//Default options
		XSInstance instance = new XSInstance();
		instance.minimumElementsGenerated = 0;
		instance.maximumElementsGenerated = 0;
		instance.generateDefaultAttributes = false;
		instance.generateOptionalAttributes = false;
		instance.maximumRecursionDepth = 0;
		instance.generateOptionalElements = true;
		
		//Root element to generate
		QName root = new QName(args[0]);

		for (int i = 0; i < samplexsd.length; i++) {
			if(samplexsd[i].isFile() && samplexsd[i].getName().contains("xsd")) { //Eliminate directories and make sure is a schema
				XSModel xsModel = new XSParser().parse(samplexsd[i].getAbsolutePath());	
				//Name the result
				XMLDocument sample = new XMLDocument(new StreamResult("SampleXML/" + samplexsd[i].getName().substring(0, samplexsd[i].getName().indexOf(".")) + ".xml"), false, 4, null);

				try {
					instance.generate(xsModel, root, sample);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				}
			}
		}		
		System.out.println("Done --- check your the SampleXML folder");
	}
}