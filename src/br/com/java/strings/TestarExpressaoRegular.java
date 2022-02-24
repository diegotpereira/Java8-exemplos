package br.com.java.strings;

import java.util.regex.*;

public class TestarExpressaoRegular {
	
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Uso:\njava TestarExpressaoRegular" + 
			"characterSequence TestarExpressaoRegular+");
			System.exit(0);
		}
		
		System.out.println("Entrada: \"" + args[0] + "\"");
		for(String arg : args) {
			System.out.println(
				"Expressão Regular: \"" + arg + "\"");

			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);

			while(m.find()) {
				System.out.println(
					"Corresponde \"" + m.group() + "\" em posições " +
					 m.start() + "-" + (m.end() - 1));
			}
		}
	}
}
