package org.altervista.fabriziocelli.publisher;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.ws.Endpoint;

import org.altervista.fabriziocelli.TestWS;

public class PublishTestWSMT {
	
	public static void main(String[] args) {
		//WS url
		String url = "http://localhost:8888/testws";
		//the service
		Endpoint endpoint = Endpoint.create(new TestWS());
		
		//threads pool and execution
		ExecutorService executor = Executors.newFixedThreadPool(10);
		endpoint.setExecutor(executor);
		
		//publish WS
		endpoint.publish(url);
		System.out.println("Service is published!");
	}

}
