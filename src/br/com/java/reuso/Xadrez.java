package br.com.java.reuso;

public class Xadrez extends JogoDeTabuleiro{

	Xadrez() {
		super(11);
		System.out.println("Construtor Xadrez");
	}
	
	public static void main(String[] args) {
		Xadrez x = new Xadrez();
	}
}
class Jogo {
	Jogo(int i) {
		System.out.println("Construtor Jogo");
	}
}
class JogoDeTabuleiro extends Jogo {
	JogoDeTabuleiro(int i) {
		super(i);
		System.out.println("Construtor JogoDeTabuleiro");
	}
}
