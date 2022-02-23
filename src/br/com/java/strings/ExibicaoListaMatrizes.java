package br.com.java.strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.java.genericos.cafe.Cafe;
import br.com.java.genericos.cafe.CafeFornecedor;

public class ExibicaoListaMatrizes {

	public static void main(String[] args) {
		List<Cafe> cafes = 
		Stream.generate(new CafeFornecedor())
		.limit(10)
		.collect(Collectors.toList());

		System.out.println(cafes);
	}
}
