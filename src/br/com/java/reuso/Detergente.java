package br.com.java.reuso;

public class Detergente extends Limpador{
	// alterar um metodo
	@Override
	public void esfregar() {
		acrescentar(" Detergente.esfregar()");
		super.esfregar();
	}
	// Add methods to the interface:
	public void espuma() {
		acrescentar(" espuma()");
	}
	public static void main(String[] args) {
		Detergente x = new Detergente();
		x.diluir();
		x.aplicar();
		x.esfregar();
		x.espuma();
		System.out.println(x);
		System.out.println("Testando a classe base:");
		Detergente.main(args);
	}
}
class Limpador {
	private String s = "Limpador";
	public void acrescentar(String a) {
		s += a;
	}
	public void diluir() {
		acrescentar(" diluir()");
	}
	public void aplicar() {
		acrescentar( "aplicar()");
	}
	public void esfregar() {
		acrescentar(" esfregar()");
	}
	@Override
	public String toString() {
		return s;
	}
	public static void main(String[] args) {
		Limpador x = new Limpador();
		x.diluir();
		x.aplicar();
		x.esfregar();
		System.out.println(x);
	}
}