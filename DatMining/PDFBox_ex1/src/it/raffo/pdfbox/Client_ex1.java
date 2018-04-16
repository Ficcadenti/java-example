package it.raffo.pdfbox;

import java.io.File;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Client_ex1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Test PDFBox - ex1");

		PDFParser parser = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		PDFTextStripper pdfStripper;

		String parsedText;
		String fileName = "C:\\Users\\r.ficcadenti\\Desktop\\Manuali\\Algoritmi\\cinesi.pdf";
		File file = new File(fileName);
		try
		{

			parser = new PDFParser(new RandomAccessFile(file, "r"));
			parser.parse();
			cosDoc = parser.getDocument();
			pdfStripper = new PDFTextStripper();
			pdDoc = new PDDocument(cosDoc);
			parsedText = pdfStripper.getText(pdDoc);
			System.out.println(parsedText.replaceAll("[^A-Za-z0-9. ]+", ""));
		}
		catch (Exception e)
		{
			e.printStackTrace();
			try
			{
				if (cosDoc != null)
				{
					cosDoc.close();
				}
				if (pdDoc != null)
				{
					pdDoc.close();
				}
			}
			catch (Exception e1)
			{
				e.printStackTrace();
			}

		}

	}

}
