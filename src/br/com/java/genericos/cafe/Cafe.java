package br.com.java.genericos.cafe;

public class Cafe {
	
	private static long contador = 0;
	private final long id = contador++;

	@Override
	public String toString() {
		
		return getClass().getSimpleName() + " " + id;
	}
}
