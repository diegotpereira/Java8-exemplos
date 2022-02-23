package br.com.java.strings;

import java.util.*;

public class MelhorLer {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(SimplesLeitura.entrada);
		teclado.useLocale(Locale.US);
		System.out.println("Qual é seu nome?");
		String nome = teclado.nextLine();
		System.out.println(nome);

		System.out.println(
			"Quantos anos você tem? Qual é a sua dupla favorita?");
		
		System.out.println("(entrada: <idade> <double>)");
		int idade = teclado.nextInt();
		double favorito =  teclado.nextDouble();

		System.out.println(idade);
		System.out.println(favorito);

		System.out.format("Olá %s.%n", nome);
		System.out.format("Em 5 anos você estará %d.%n", idade + 5);
		System.out.format("Minha dupla favorita é %f.", favorito / 2);

	}
}
