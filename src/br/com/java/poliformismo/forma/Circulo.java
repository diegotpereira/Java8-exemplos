package br.com.java.poliformismo.forma;

public class Circulo extends Forma{
	
	@Override
	public void desenhar() {
		System.out.println("Circulo.desenhar()");
	}

	@Override
	public void apagar() {
		System.out.println("Circulo.apagar()");
	}
}
