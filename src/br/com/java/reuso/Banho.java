package br.com.java.reuso;

public class Banho {
	private String s1 = "Feliz";
	private String s2 =  "Feliz";
	private String s3;
	private String s4;

	private Sabao castile;
	private int i;
	private float brinquedo;

	private Banho() {
		System.out.println("Banho Interno()");
		s3 = "Brinquedo";
		brinquedo = 3.14f;
		castile = new Sabao();
	}
	//Inicialização da instância
	{ i = 47;}
	@Override
	public String toString() {
		if(s4 == null)
		s4 = "Brinquedo";

		return
		"s1 = " + s1 + "\n" +
 		"s2 = " + s2 + "\n" + 
		"s3 = " + s3 + "\n" +
		"s4 = " + s4 + "\n" + 
		"i = " + i + "\n" + 
		"brinquedo = " + brinquedo + "\n" + 
		"castile = " + castile; 
	}
	public static void main(String[] args) {
		Banho b = new Banho();
		System.out.println(b);
	}
}
class Sabao {
	private String s;
	Sabao() {
		System.out.println("Sabao()");
		s = "Construidos";
	}
	@Override
	public String toString() {
		return s;
	}
	
}