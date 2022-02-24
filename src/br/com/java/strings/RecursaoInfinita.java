package br.com.java.strings;

import java.util.stream.*;

public class RecursaoInfinita {

	@Override
	public String toString() {
		return "RecursaoInfinita endereço: " + this + "\n";
	}

	public static void main(String[] args) {
		Stream.generate(RecursaoInfinita::new)
		.limit(10)
		.forEach(System.out::println);
	}
}
