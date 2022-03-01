package br.com.java.poliformismo.forma;

public class PolimorfismoEstatico {
	
	
	public static void main(String[] args) {
		EstaticoSuper sup = new EstaticoSub();
		System.out.println(EstaticoSuper.staticGet());
		System.out.println(sup.dinamicoGet());
	}
}
class EstaticoSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}
	public String dinamicoGet() {
		return "Base dinamicoGet()";
	}
}
class EstaticoSub extends EstaticoSuper {
	public static String staticGet() {
		return "Derivado staticGet()";
	}
	@Override
	public String dinamicoGet() {
		
		return "Derivado dinamicoGet()";
	}
}
