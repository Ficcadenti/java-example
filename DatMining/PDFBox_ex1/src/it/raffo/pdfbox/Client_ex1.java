package it.raffo.pdfbox;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Client_ex1
{

	public static void main(String[] args)
	{
		System.out.println("Test PDFBox - ex1");
		String fileNameDizionario = "D:\\Temp\\dizionario.txt";
		List<String> listParole = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileNameDizionario), StandardCharsets.ISO_8859_1))
		{
			stream.forEach(p -> listParole.add(p));
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// String fileNameAlfabeto = "D:\\Temp\\paesi.txt";
		// List<String> listParoleA = new ArrayList<>();
		//
		// try (Stream<String> stream = Files.lines(Paths.get(fileNameAlfabeto),
		// StandardCharsets.ISO_8859_1))
		// {
		// stream.forEach(p -> listParoleA.add(p));
		// }
		// catch (IOException e)
		// {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		String regexDizionario = "(?i)\\b(" + String.join("|", listParole) + ")\\b";

		PDFParser parser = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		PDFTextStripper pdfStripper;

		String parsedText;
		String fileName = "D:\\Temp\\cv.pdf";
		File file = new File(fileName);
		try
		{

			parser = new PDFParser(new RandomAccessFile(file, "r"));
			parser.parse();
			cosDoc = parser.getDocument();
			pdfStripper = new PDFTextStripper();
			pdDoc = new PDDocument(cosDoc);
			parsedText = pdfStripper.getText(pdDoc);
			List<String> parole = Arrays
					.asList(parsedText.replaceAll(regexDizionario, "").replaceAll("\\s+", "::").split("::"));
			parole.forEach(p -> System.out.println("[" + p.trim() + "]"));
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
