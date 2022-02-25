package br.com.java.poliformismo.forma;

public class ContagemdeReferencia {
	
	public static void main(String[] args) {
		Compartilhado compartilhado = new Compartilhado();
		Composicao[] composicao = {
			new Composicao(compartilhado),
			new Composicao(compartilhado),
			new Composicao(compartilhado),
			new Composicao(compartilhado),
			new Composicao(compartilhado)
		};
		for(Composicao c : composicao)
		c.dispor();
	}
}
class Compartilhado {
	private int refContar = 0;
	private static long contar = 0;
	private final long id = contar++;

	Compartilhado() {
		System.out.println("Criando " + this);
	}
	public void addRef() {
		refContar++;
	}
	protected void dispor() {
		if (--refContar == 0) {
			System.out.println("descarte " + this);
		}
	}
	@Override
	public String toString() {
		
		return "Compartilhado " + id;
	}
}
class Composicao {
	private Compartilhado compartilhado;
	private static long contar = 0;
	private final long id = contar++;

	Composicao(Compartilhado compartilhado) {
		System.out.println("Criando " + this);
		this.compartilhado = compartilhado;
		this.compartilhado.addRef();
	}
	protected void dispor() {
		System.out.println("descarte " + this);
		compartilhado.dispor();
	}
	@Override
	public String toString() {
		
		return "Composição " + id;
	}
}
