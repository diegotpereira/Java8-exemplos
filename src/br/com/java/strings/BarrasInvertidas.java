package br.com.java.strings;

public class BarrasInvertidas {
	
	public static void main(String[] args) {

		String um = "\\";
		String dois = "\\\\";
		String tres = "\\\\\\";

		System.out.println(um);
		System.out.println(dois);
		System.out.println(tres);

		System.out.println(um.matches("\\\\"));
		System.out.println(dois.matches("\\\\\\\\"));
		System.out.println(tres.matches("\\\\\\\\\\\\"));

	}
}
