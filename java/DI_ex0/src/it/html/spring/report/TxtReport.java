package it.html.spring.report;

public class TxtReport implements Report {
  
	String path;
	  
    public TxtReport(String path) { this.path = path; }

	public void generate(String data) {
		System.out.println("genera txt report");
	}
	
	public void saveToFile() {
		System.out.println("File salvato");
	}	
}
