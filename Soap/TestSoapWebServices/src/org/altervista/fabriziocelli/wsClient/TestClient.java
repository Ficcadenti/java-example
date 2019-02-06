package org.altervista.fabriziocelli.wsClient;

public class TestClient {
	
	public static void main(String[] args){
		//instantiate the service
		TestWSService service = new TestWSService();
		//open the port
		TestWS port = service.getTestWSPort();
		
		//call the methods
		System.out.println(port.getLanguages());
		System.out.println(port.getTermcodeByTerm("prova"));
	}

}
