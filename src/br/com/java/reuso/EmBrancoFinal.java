package br.com.java.reuso;

public class EmBrancoFinal {

	private final int i = 0;
	private final int j;
	private final Boneco p;

	public EmBrancoFinal() {
		j = 1;
		p = new Boneco(1);
	}
	public EmBrancoFinal(int x) {
		j = x;
		p = new Boneco(x);
	}
	
	public static void main(String[] args) {
		new EmBrancoFinal();
		new EmBrancoFinal(47);
	}
}
class Boneco {
	private int i;

	Boneco(int ii) {
		i = ii;
	}
}