package org.altervista.fabriziocelli.publisher;

import javax.xml.ws.Endpoint;

import org.altervista.fabriziocelli.TestWS;

public class PublishWS {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/testws", new TestWS());
		System.out.println("Service is published!");
	}
	
}
