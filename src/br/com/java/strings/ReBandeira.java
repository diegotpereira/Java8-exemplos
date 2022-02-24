package br.com.java.strings;

import java.util.regex.*;


public class ReBandeira {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(
		"^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);

		Matcher m = p.matcher(
			"java tem regex\nJava tem regex\n" + 
			"JAVA tem expressões regulares muito boas\n" + 
			"Expressões regulares estão em Java");
		while(m.find())
		System.out.println(m.group());
	}
}
