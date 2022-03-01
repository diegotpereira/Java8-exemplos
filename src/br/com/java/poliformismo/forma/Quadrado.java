package br.com.java.poliformismo.forma;

public class Quadrado extends Forma{

	@Override
	public void desenhar() {
		System.out.println("Quadrado.desenhar()");
	}

	@Override
	public void apagar() {
		System.out.println("Quadrado.apagar()");
	}
}
