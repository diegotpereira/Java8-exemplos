package br.com.java.reuso;

public class Besouro extends Inseto{

	private int k = printInit("Besouro.k inicializado");

	public Besouro() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x2 = printInit("static Besouro.x2 inicializado");
	
	public static void main(String[] args) {
		System.out.println("Besouro construtor");
		Besouro b = new Besouro();
	}
}
class Inseto {
	private int i = 9;
	protected int j;

	Inseto() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Inseto.x1 inicializado");
	

	static int printInit(String s) {
		System.out.println(s);

		return 47;
	}
}
