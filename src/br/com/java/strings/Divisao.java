package br.com.java.strings;

import java.util.Arrays;

public class Divisao {
	public static String cavaleiros = 
	       "Então, quando você encontrar os arbustos," + 
		   "você deve cortar a árvore mais poderosa do" + 
		   "floresta... com... um arenque!";

		   public static void split(String regex) {
			   System.out.println(Arrays.toString(cavaleiros.split(regex)));
		   }
		   public static void main(String[] args) {
			   split(" ");
			   split("\\W+");
			   split("n\\W+");
		   }
}
