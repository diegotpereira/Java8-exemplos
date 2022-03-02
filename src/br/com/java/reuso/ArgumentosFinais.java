package br.com.java.reuso;

public class ArgumentosFinais {

	void with(final Gizmo g) {

	}
	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}
	
	public static void main(String[] args) {
		ArgumentosFinais af = new ArgumentosFinais();
		af.without(null);
		af.with(null);
	}
}
class Gizmo {
	public void spin() {}
}
