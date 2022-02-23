package br.com.java.genericos.cafe;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import java.lang.reflect.InvocationTargetException;

public class CafeFornecedor implements Supplier<Cafe>, Iterable<Cafe>{

	private Class<?>[] tipos = {Latte.class, Mocha.class,
	                            Cappuccino.class, Americano.class, Breve.class, };
    private static Random rand = new Random(47);

	public CafeFornecedor() {}

	// Para Interação
	private int size = 0;

	public CafeFornecedor(int sz) {
		size = sz;
	}

	@Override
	public Cafe get() {
		try {
			return (Cafe)
			tipos[rand.nextInt(tipos.length)]
			.getConstructor().newInstance();

		} catch (InstantiationException |
		         NoSuchMethodException |
				 InvocationTargetException |
				 IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	class CafeIterator implements Iterator<Cafe> {
		int contar = size;

		@Override
		public boolean hasNext() {
			
			return contar > 0;
		}

		@Override
		public Cafe next() {
			contar --;

			return CafeFornecedor.this.get();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Iterator<Cafe> iterator() {
		return new CafeIterator();
	}

	public static void main(String[] args) {
		
		Stream.generate(new CafeFornecedor(5))
		.limit(5)
		.forEach(System.out::println);

		for(Cafe c : new CafeFornecedor(5))
		System.out.println(c);
	}
}
