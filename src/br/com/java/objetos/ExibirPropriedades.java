package br.com.java.objetos;

public class ExibirPropriedades {
	
	public static void main(String[] args) {
		
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));

		System.out.println(System.getProperty("java.library.path"));
	}
}
