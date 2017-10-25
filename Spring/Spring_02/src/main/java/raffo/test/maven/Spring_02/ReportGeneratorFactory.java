package raffo.test.maven.Spring_02;

public class ReportGeneratorFactory {

	public static ReportGenerator createTxtReportGenerator() {

		ReportGenerator rg = new ReportGenerator();

		rg.setReport(new TxtReport("/report"));

		return rg;
	}
	
	public static ReportGenerator createPdfReportGenerator() {

		ReportGenerator rg = new ReportGenerator();

		rg.setReport(new PdfReport("/report"));

		return rg;
	}
}

