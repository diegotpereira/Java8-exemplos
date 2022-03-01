package br.com.java.poliformismo.forma;

public class Transmogrificar {
	
	public static void main(String[] args) {
		Etapa etapa = new Etapa();
		etapa.executarJogar();
		etapa.alterar();
		etapa.executarJogar();
	}
}
class Ator {
	public void ato() {}
}
class AtorFeliz extends Ator {
	@Override
	public void ato() {
		System.err.println("AtorFeliz");
	}
}
class AtorTriste extends Ator {
	@Override
	public void ato() {
		System.out.println("AtorTriste");
	}
}
class Etapa {
	private Ator ator = new AtorFeliz();

	public void alterar() {
		ator = new AtorTriste();
	}

	public void executarJogar() {
		ator.ato();
	}
}