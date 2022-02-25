package br.com.java.poliformismo.forma;

public class Refletir {
	
	public static void main(String[] args) {
		MaisUtil[] x = {
			(MaisUtil) // Adicionado Cast
			new Util(),
			new MaisUtil()
		};
		x[0].f();
		x[1].g();
	}
}
class Util {
	public void f() {}
	public void g() {}
}
class MaisUtil extends Util{
	@Override
	public void f() {}

	@Override
	public void g() {}

	public void u() {}
	public void v() {}
	public void w() {}
}
