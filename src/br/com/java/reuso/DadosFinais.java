package br.com.java.reuso;

import java.util.Random;

public class DadosFinais {
	
	private static Random rand = new Random(47);
	private String id;

	public DadosFinais(String id) {
		this.id = id;
	}

	public final int valorUm = 9;
	// Podem ser constantes de tempo de compilação:
	private static final int VALOR_DOIS = 99;
	// Constante pública típica:	
	private static final int VALOR_TRES = 39;
	// Não podem ser constantes de tempo de compilação:
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);
	private Valor v1 = new Valor(11);
	private final Valor v2 = new Valor(22);
	private static final Valor VAL_3 = new Valor(33);

	// Arrays 
	private final int[] a = {1, 2, 3, 4, 5, 6};

	@Override
	public String toString() {
		return id + ": " + "i4 = " + i4 +
		", INT_5 = " + INT_5;
	}
	public static void main(String[] args) {
		DadosFinais df1 = new DadosFinais("df1");
		df1.v2.i++;
		df1.v1 = new Valor(9);
		for(int i = 0; i < df1.a.length; i++)
		df1.a[i]++;

		System.out.println(df1);
		System.out.println("Criando novo DadosFinais");

		DadosFinais df2 = new DadosFinais("df2");
		System.out.println(df1);
		System.out.println(df2);
	}
}
class Valor {
	// Acesso ao pacote
	int i;
	Valor(int i) {
		this.i = i;
	}
}