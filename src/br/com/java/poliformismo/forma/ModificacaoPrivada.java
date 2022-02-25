package br.com.java.poliformismo.forma;

public class ModificacaoPrivada {
	private void f() {
		System.out.println("private f()");
	}
	
	public static void main(String[] args) {
		ModificacaoPrivada mp = new Derivada();
		mp.f();
	}
}
class Derivada extends ModificacaoPrivada {
	public void f() {
		System.out.println("public f()");
	}
}
