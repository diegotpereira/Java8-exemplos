package br.com.java.poliformismo.forma;

import java.util.Random;

public class FormasAleatorias {
	
	private Random rand = new Random(47);
	public Forma get() {
		switch (rand.nextInt(3)) {
			default:
			
			case 0:
			return new Circulo();

			case 1: 
			return new Quadrado();

			case 2:
			return new Triangulo();
		}
	}
	public Forma[] array(int sz) {
		Forma[] formas = new Forma[sz];

		for(int index = 0; index < formas.length; index++) 
		formas[index] = get();
		
		return formas;
	}
}
