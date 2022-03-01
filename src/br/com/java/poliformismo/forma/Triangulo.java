package br.com.java.poliformismo.forma;

public class Triangulo extends Forma{
	
	@Override
	public void desenhar() {
		System.out.println("Triangulo.desenhar()");
	}

	@Override
	public void apagar() {
		System.out.println("Triangulo.apagar()");
	}
}
