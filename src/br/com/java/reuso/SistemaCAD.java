package br.com.java.reuso;

public class SistemaCAD extends Forma{
	
	private Circulo c;
	private Triangulo t;
	private Linha[] linhas = new Linha[3];

	public SistemaCAD(int i ) {
		super(i + 1);

		for(int j = 0; j < linhas.length; j++) 
		linhas[j] = new Linha(j, j * j);

		c = new Circulo(1);
		t = new Triangulo(1);

		System.out.println("Construtor combinado");
	}
	@Override
	void descarte() {
		System.out.println("SistemaCad.descarte()");
		t.descarte();
		c.descarte();
		for(int i = linhas.length -1; i >= 0; i--)
			linhas[i].descarte();
		super.descarte();
	}
	
	public static void main(String[] args) {
		
		SistemaCAD x = new SistemaCAD(47);

		try {

		}finally {
			x.descarte();
		}

	}
}
class Forma {
	Forma(int i) {
		System.out.println("Forma construtor");
	}
	void descarte() {
		System.out.println("Descarte de forma");
	}
}
class Circulo extends Forma {
	Circulo(int i) {
		super(i);
		System.out.println("Círculo de desenho");
	}
	@Override
	void descarte() {
		System.out.println("Apagando Círculo");
		super.descarte();
	}
}
class Triangulo extends Forma {
	Triangulo(int i) {
		super(i);
		System.out.println("Desenhando Triangulo");
	}
	@Override
	void descarte() {
		System.out.println("Apagando Triangulo");
		super.descarte();
	}
}
class Linha extends Forma {
	private int iniciar;
	private int finalizar;

	Linha(int iniciar, int finalizar) {
		super(iniciar);
		this.iniciar = iniciar;
		this.finalizar = finalizar;

		System.out.println("Desenhar Linha: " + iniciar + ", " + finalizar);
	}
	@Override
	void descarte() {
		System.out.println("Apagando Linha: " + iniciar + ", " + finalizar);
		super.descarte();
	}
}