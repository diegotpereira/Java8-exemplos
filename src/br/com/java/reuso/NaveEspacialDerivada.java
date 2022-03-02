package br.com.java.reuso;

public class NaveEspacialDerivada extends ControlesDeNavesEspaciais{

	private String nome;

	public NaveEspacialDerivada(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}

	public static void main(String[] args) {
		NaveEspacialDerivada protetor = new NaveEspacialDerivada("Protetor NSEA");
		protetor.frente(100);
	}
}
