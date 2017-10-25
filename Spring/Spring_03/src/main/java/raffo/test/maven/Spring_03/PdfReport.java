package raffo.test.maven.Spring_03;

public class PdfReport implements Report {

	String path;
	  
    public PdfReport(String path) { this.path = path; }
    
    public void generate(String data) {
		System.out.printf("Genera PDF report nel path: %s\n",path);
	}
	
	public void saveToFile() {
		System.out.printf("File salvato nel path: %s\n",path);
	}	

}
