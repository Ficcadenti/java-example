package raffo.test.maven.Spring_03;

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
