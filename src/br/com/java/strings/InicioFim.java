package br.com.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InicioFim {
	public static String entrada = 
	"Enquanto houver injustiça, sempre que um\n" + 
	"O bebê Targathian chora, onde quer que uma angústia\n" + 
	"sons de sinal entre as estrelas " + 
	"... Estaremos lá.\n" + 
	"Este belo navio e esta bela tripulação...\n" + 
	"Este belo navio e esta bela tripulação...";

	private static class Tela {
		private boolean regexImpresso = false;
		private String regex;

		Tela(String regex) {
			this.regex = regex;
		}

		void tela(String mensagem) {
			if (!regexImpresso) {
				System.out.println(regex);
				regexImpresso = true;
			}
			System.out.println(mensagem);
		}
	}
	static void examinar(String s, String regex) {
		Tela d = new Tela(regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);

		while(m.find())
		d.tela("find() '" + m.group() + 
		"' inicio = " + m.start() + " fim = " + m.end());

		if(m.lookingAt())
		d.tela("lookingAt() inicio = " + m.start() + " fim = " + m.end());

		if(m.matches())
		d.tela("matches() inicio = " + m.start() + " fim = " + m.end());
	}

	public static void main(String[] args) {
		for(String in : entrada.split("\n")) {
			System.out.println("entrada : " + in);
			for(String regex : new String[] {
				"\\w*ever", "T\\w+", "Nunca.*?!"}) examinar(in, regex);
		}
	}
}
