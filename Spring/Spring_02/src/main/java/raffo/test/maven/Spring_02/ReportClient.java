package raffo.test.maven.Spring_02;

public class ReportClient {
	
	public static void main(String[] args) {

		String data = null;
		
		ReportGenerator genTxt = ReportGeneratorFactory.createTxtReportGenerator();
		ReportGenerator genPdf = ReportGeneratorFactory.createPdfReportGenerator();
	    
		genTxt.generate(data).saveToFile();
		genPdf.generate(data).saveToFile();
	}
}