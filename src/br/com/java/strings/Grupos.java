package br.com.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grupos {
	
	public static final String POEM = 
					"Era briluz. As lesmolisas touvas\n"  +
					"roldavam e reviam nos gramilvos.\n" +
					"Estavam mimsicais as pintalouvas,\n" +
					"E os momirratos davam grilvos.\n" +

					"“Foge do Jaguadarte, o que não morre!\n" +
					"Garra que agarra, bocarra que urra!\n" +
					"Foge da ave Fefel, meu filho, e corre\n" +
					"Do frumioso Babassura!”\n" +

					"Ele arrancou sua espada vorpal\n" +
					"e foi atras do inimigo do Homundo.\n" +
					"Na árvore Tamtam ele afinal\n" +
					"Parou, um dia, sonilundo.\n" +

					"E enquanto estava em sussustada sesta,\n" +
					"Chegou o Jaguadarte, olho de fogo,\n" +
					"Sorrelfiflando atraves da floresta,\n" +
					"E borbulia um riso louco!\n" +

					"Um dois! Um, dois! Sua espada mavorta\n" +
					"Vai-vem, vem-vai, para tras, para diante!\n" +
					"Cabeca fere, corta e, fera morta,\n" +
					"Ei-lo que volta galunfante.\n" +

					"“Pois entao tu mataste o Jaguadarte!\n" +
					"Vem aos meus braços, homenino meu!\n" +
					"Oh dia fremular! Bravooh! Bravarte!”\n" +
					"Ele se ria jubileu.\n" +

					"Era briluz.As lesmolisas touvas\n" +
					"Roldavam e relviam nos gramilvos.\n" +
					"Estavam mimsicais as pintalouvas,\n" +
					"E os momirratos davam grilvos.";

	public static void main(String[] args) {
		Matcher m = Pattern.compile(
			"(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
			.matcher(POEM);

			while(m.find()) {
				for(int j = 0; j <= m.groupCount(); j++) 
				System.out.print("[" + m.group(j) + "]");
				System.out.println();
			}
	}
}
