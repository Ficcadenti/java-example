package raffo.test.maven.Spring_03;

public class TxtReport implements Report {
  
	String path;
	  
    public TxtReport(String path) { this.path = path; }

	public void generate(String data) {
		System.out.printf("Genera TXT report nel path: %s\n",path);
	}
	
	public void saveToFile() {
		System.out.printf("File salvato nel path: %s\n",path);
	}	
}
