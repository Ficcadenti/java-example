package raffo.test.maven.Spring_03;

public class PdfReport implements Report {

	String path;
	  
    public PdfReport(String path) { this.path = path; }
    
	public void generate(String data) {
		System.out.println("genera pdf report");
	}
	
	public void saveToFile() {
		System.out.println("File salvato");
	}	

}
