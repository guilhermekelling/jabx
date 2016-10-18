package jaxb;

import javax.xml.ws.Endpoint;

public class Publicador {
	public static void main(String[] args){
		System.out.println("web service - Gerador Inicializado");
		Gerador gerador = new Gerador();
		Endpoint.publish("http://localhost:8080/gerador", gerador);
	}

}
