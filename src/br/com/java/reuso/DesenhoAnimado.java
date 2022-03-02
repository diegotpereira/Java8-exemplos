package br.com.java.reuso;

public class DesenhoAnimado extends Desenho{

	public DesenhoAnimado() {
		System.out.println("Construtor DesenhoAnimado");
	}
	
	public static void main(String[] args) {
		DesenhoAnimado x = new DesenhoAnimado();
	}
}
class Arte {
	Arte() {
		System.out.println("Construtor Arte");
	}
}
class Desenho extends Arte {
	Desenho() {
		System.out.println("Construtor Desenho");
	}
}
