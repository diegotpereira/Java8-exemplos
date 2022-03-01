package br.com.java.poliformismo.forma;

public class Formas {
	
	public static void main(String[] args) {
		FormasAleatorias gen = new FormasAleatorias();

		for(Forma forma : gen.array(9))
		forma.desenhar();
	}
}
