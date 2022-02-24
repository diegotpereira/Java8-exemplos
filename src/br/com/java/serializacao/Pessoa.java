package br.com.java.serializacao;

import java.io.File;
import java.util.*;
import nu.xom.*;

public class Pessoa extends ArrayList<UmaPessoa>{
	
	public Pessoa(String arquivoNome) throws Exception {
		Document doc = new Builder().build(new File(arquivoNome));

		Elements elements = doc.getRootElement().getChildElements();
		for(int index = 0; index < elements.size(); index++)
			add(new UmaPessoa(elements.get(index)));
	}
	public static void main(String[] args) throws Exception {
		Pessoa p = new Pessoa("Pessoa.xml");
		System.out.println(p);
	}
}
