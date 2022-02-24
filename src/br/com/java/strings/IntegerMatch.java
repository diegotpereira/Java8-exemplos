package br.com.java.strings;

import java.util.stream.Stream;

public class IntegerMatch {
	
	public static void main(String[] args) {
		String possivelmenteMenos = "-?\\d+";
		Stream.of(
			"-1234".matches(possivelmenteMenos),
			"5678".matches(possivelmenteMenos),
			"+911".matches(possivelmenteMenos),
			"+911".matches("(-|\\+)?\\d+")
		).forEach(System.out::println);
	}
}
