package it.html.spring.report;

public class ReportClient {
	
	public static void main(String[] args) {

		String data = null;
		
		ReportGenerator gen = ReportGeneratorFactory.createTxtReportGenerator();
	    
		gen.generate(data).saveToFile();
	}
}
