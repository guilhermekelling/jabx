package jaxb;

import javax.jws.WebService;

@WebService
public class Gerador {
	public double geraNumero(){
		return Math.random() * 200;
	}
}
