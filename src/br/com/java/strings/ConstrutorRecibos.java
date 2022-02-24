package br.com.java.strings;

import java.util.*;

public class ConstrutorRecibos {
	
	private double total = 0;
	private Formatter f = new Formatter(new StringBuilder());

	public ConstrutorRecibos() {
		f.format("%-15s %5s %10s%n", "Item", "Qtd", "Preco");
		f.format("%-15s %5s %10s%n", "----", "----", "----");
	}
	public void add(String nome, int qtd, double preco) {
		f.format("%-15.15s %5d %10.2f%n", nome, qtd, preco);
		total += preco * qtd;
	}
	public String build() {
		f.format("%-15s %5s %10.2f%n", "Taxa", "", total * 0.06);
		f.format("%-15s %5s %10s%n", "", "", "-----");
		f.format("%-15s %5s %10.2f%n", "Total", "", total * 1.06);

		return f.toString();
	}
	public static void main(String[] args) {
		ConstrutorRecibos construtorRecibos = new ConstrutorRecibos();
		construtorRecibos.add("João e o Pé de Feijão", 4, 4.25);
		construtorRecibos.add("A princesa e a ervilha", 3, 5.1);
		construtorRecibos.add("Cachinhos Dourados e os Três Ursos", 1, 14.29);

		System.out.println(construtorRecibos.build());
	}
}
