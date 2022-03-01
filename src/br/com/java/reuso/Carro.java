package br.com.java.reuso;

public class Carro {
	public Motor motor = new Motor();
	public Roda[] roda = new Roda[4];

	public Porta 
	esquerda = new Porta(), 
	direita = new Porta();

	public Carro() {
		for(int i = 0; i < 4; i++)
		roda[i] = new Roda();
	}
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.esquerda.janela.rolarCima();
		carro.roda[0].encher(72);
	}
}
class Motor {
	private void ligar() {}
	private void rotacao() {}
	public void parar() {}
}
class Roda {
	public void encher(int psi) {}
}
class Janela {
	public void rolarCima() {}
	public void rolarBaixo() {}
}
class Porta {
	public Janela janela = new Janela();
	public void abrir() {}
	public void fechar() {}
}