package it.html.spring.report;

public interface Report {
	public void generate(String data);
	public void saveToFile();
}
