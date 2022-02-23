package br.com.java.strings;

import java.io.BufferedReader;
import java.io.StringReader;

public class SimplesLeitura {
	
	public static BufferedReader entrada = 
	new BufferedReader(new StringReader(
		"Sir Robin de Camelot\n22 1.61803"));

		public static void main(String[] args) {
			
			try {
				System.out.println("Qual é seu nome?");
				String nome = entrada.readLine();

				System.out.println(nome);

				System.out.println("Quantos anos você tem? " + 
				"Qual é a sua dupla favorita?");
				System.out.println("(entrada: <idade> <double>)");

				String numeros = entrada.readLine();
				System.out.println(numeros);

				String[] numArray = numeros.split(" ");
				int idade = Integer.parseInt(numArray[0]);

				double favorito = Double.parseDouble(numArray[1]);

				System.out.format("Olá %s.%n", nome);
				System.out.format("Em 5 anos você estará %d.%n", idade + 5);

				System.out.format("Minha favorita dupla é %f.", favorito / 2);
			} catch (Exception e) {
				System.err.println("I/O exception");
			}
		}
}
