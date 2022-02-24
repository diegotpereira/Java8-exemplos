package br.com.java.strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
	public static void main(String[] args) throws IOException {
		// O parâmetro args é um array que recebe dados da command line 
		// (linha de comando), ou seja, no momento que executamos a nossa 
		// aplicação podemos enviar uma informação por meio dele.
		if(args.length < 2) {
			System.out.println("Uso: java JGrep arquivo regex");
			System.exit(0);
		}
		Pattern p = Pattern.compile(args[1]);
		Matcher m = p.matcher("");

		Files.readAllLines(Paths.get(args[0])).forEach(
			line -> {
				m.reset(line);
				while(m.find())
				System.out.println(
					m.group() + ": " + m.start());
			}
		);
	}
}
