package it.html.spring.report;

public class ReportGeneratorFactory {

	public static ReportGenerator createTxtReportGenerator() {

		ReportGenerator rg = new ReportGenerator();

		rg.setReport(new TxtReport("/report"));

		return rg;
	}
}
