package br.com.java.poliformismo.forma;

public class RetornoCovariante {
	public static void main(String[] args) {
		Moinho m = new Moinho();
		Grao g = m.processo();
		System.out.println(g);
		m = new MoinhodeTrigo();
		g = m.processo();
		System.out.println(g);
		
	}
}

// Mill
class Moinho {
	Grao processo() {
		return new Grao();
	}
}
// Grain
class Grao {

	@Override
	public String toString() {
		return "Grao";
	}
}

// Wheat
class Trigo extends Grao {
	@Override
	public String toString() {
		return "Trigo";
	}
}

// WheatMill
class MoinhodeTrigo extends Moinho{

	@Override
	Trigo processo() {
		return new Trigo();
	}
}
