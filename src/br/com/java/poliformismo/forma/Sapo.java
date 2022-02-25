package br.com.java.poliformismo.forma;

public class Sapo extends Anfibio{
	private Caracteristica c = new Caracteristica("Coaxar");
	private Descricao d = new Descricao("Come insetos");

	public Sapo() {
		System.out.println("Sapo()");
	}

	@Override
	protected void descarte() {
		System.out.println("Sapo descarte");
		d.descarte();
		c.descarte();
		super.descarte();
	}
	
	public static void main(String[] args) {
		Sapo sapo = new Sapo();
		System.out.println("Adeus!");
		sapo.descarte();
	}
}

class Caracteristica {
	private String s;
	Caracteristica(String s) {
		this.s = s;
		System.out.println("Criando Característica " + s);
	}
	protected void descarte() {
		System.out.println("Característica de descarte " + s);
	}
}
class Descricao {
	private String s;

	Descricao(String s) {
		this.s = s;
		System.out.println("Criando Descrição " + s);
	}
	protected void descarte() {
		System.out.println("Descarte Descrição " + s);
	}
}
class CriaturaViva {
	private Caracteristica c = new Caracteristica("Está vivo");
	private Descricao d = new Descricao("Criatura Viva Básica");
	
	CriaturaViva() {
		System.out.println("CriaturaViva()");
	}
	protected void descarte() {
		System.out.println("CriaturaViva descarte");
		d.descarte();
		c.descarte();

	}
}
class Animal extends CriaturaViva {
	private Caracteristica c = new Caracteristica("tem coração");
	private Descricao d = new Descricao("Animal não vegetal");

	Animal() {
		System.out.println("Animal()");
	}

	@Override
	protected void descarte() {
		System.out.println("Descarte de animais");
		d.descarte();
		c.descarte();
		super.descarte();
	}
}
class Anfibio extends Animal {
	private Caracteristica c = new Caracteristica("pode viver na água");
	private Descricao d = new Descricao("Tanto a água quanto a terra");

	Anfibio() {
		System.out.println("Anfíbio()");
	}
	@Override
	protected void descarte() {
		System.out.println("Anfíbio descarte");
		d.descarte();
		c.descarte();
		super.descarte();
	}
}


