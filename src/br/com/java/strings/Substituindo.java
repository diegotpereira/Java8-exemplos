package br.com.java.strings;

public class Substituindo {
	static String s = Divisao.cavaleiros;

	public static void main(String[] args) {
		System.out.println(s.replaceFirst("f\\w+", "localizacao"));
		System.out.println(s.replaceAll("arbusto|árvore|arenque","banana"));
	}
}
