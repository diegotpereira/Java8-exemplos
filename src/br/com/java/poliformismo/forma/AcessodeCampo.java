package br.com.java.poliformismo.forma;

public class AcessodeCampo {
	
	public static void main(String[] args) {
		Super sup = new Sub();
		System.out.println("sup.campo = " + sup.campo + 
		", sup.getCampo() = " + sup.getCampo());

		Sub sub = new Sub();
		System.out.println("Sub.campo = " + 
		sub.campo + ", sub.getCampo() = " + 
		sub.getCampo() + 
		", subSuperCampo() = " +
		sub.getSuperCampo());
	}
}

class Super {
	public int campo = 0;
	public int getCampo() {
		return campo;
	}
}
class Sub extends Super {
	public int campo = 1;

	@Override
	public int getCampo() {
		return campo;
	}
	public int getSuperCampo() {
		return super.campo;
	}
}
