package br.com.java.strings;

public class Imutavel {

	public static String upcase(String s)  {
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		String q = "howdy";
		System.out.println(q);

		String qq = upcase(q);

		System.out.println(qq);
		System.out.println(q);
	}
}
