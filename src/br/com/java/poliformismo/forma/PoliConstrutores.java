package br.com.java.poliformismo.forma;

public class PoliConstrutores {
	
	public static void main(String[] args) {

		new GlifoRedondo(5);
		
	}
}

class Glifo {

	void desenhar() {
		System.out.println("Glifo.desenhar()");
	}
	Glifo() {
		System.out.println("Glifo() depois desenhar()");
		desenhar();
		System.out.println("Glifo() antes desenhar()");
	}
}
class GlifoRedondo extends Glifo{
	private int raio = 1;

	GlifoRedondo(int r) {
		raio = r;

		System.out.println("GlifoRedondo.GlifoRedondo(), raio = " + raio);
	}
	@Override
	void desenhar() {
		System.out.println("GlifoRedondo.desenhar(), raio = " + raio);
	}
}
