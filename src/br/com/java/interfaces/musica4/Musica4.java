package br.com.java.interfaces.musica4;

import br.com.java.poliformismo.musica.Instrumento;
import br.com.java.poliformismo.musica.Nota;

class Sopro extends Instrumento {
	@Override
	public void play(Nota n) {
		super.play(n);
		System.out.println("Sopro.play() " + n );
	} 
}

class Cordas extends Instrumento{

	@Override
	public void play(Nota n) {
		super.play(n);
		System.out.println("Cordas.play()" + n);
	}
	
}

public class Musica4 {

	static void tune(Instrumento i) {

	}

	static void tuneAll(Instrumento[] e) {

	}
	public static void main(String[] args) {
		Instrumento[] orquestra = {
			new Sopro(),
			new Cordas()
		};
		tuneAll(orquestra);
	}

}
