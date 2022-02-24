package br.com.java.serializacao;

import nu.xom.*;
import java.io.*;
import java.util.*;

public class UmaPessoa {
	private String primeiro;
	private String ultimo;

	public UmaPessoa(String primeiro, String ultimo) {
		this.primeiro = primeiro;
		this.ultimo = ultimo;
	}

	// Produza um elemento XML a partir deste objeto UmaPessoa
	public Element getXML() {
		Element pessoa = new Element("pessoa");
		Element primeiroNome = new Element("primeiro");
		primeiroNome.appendChild(primeiro);

		Element ultimoNome = new Element("ultimo");
		ultimoNome.appendChild(ultimo);
		pessoa.appendChild(primeiroNome);
		pessoa.appendChild(ultimoNome);

		return pessoa;
	}
	// Construtor restaura um APerson de XML:
	public UmaPessoa(Element pessoa) {
		primeiro = pessoa.getFirstChildElement("primeiro").getValue();
		ultimo = pessoa.getFirstChildElement("ultimo").getValue();
	}

	@Override
	public String toString() {
		return "UmaPessoa [primeiro=" + primeiro + ", ultimo=" + ultimo + "]";
	}
	public static void format(OutputStream os, Document doc) throws Exception {
		Serializer serializer = new Serializer(os, "ISO-8859-1");
		serializer.setIndent(4);
		serializer.setMaxLength(60);
		serializer.write(doc);
		serializer.flush();
	}
	public static void main(String[] args) throws Exception {
		List<UmaPessoa> pessoa = Arrays.asList(
			new UmaPessoa("Dr. Claudio", "Silva"),
			new UmaPessoa("Dr. Flavio", "Basso"),
			new UmaPessoa("Dr. Nestor", "Gomes"));

		System.out.println(pessoa);

		Element root = new Element("pessoa");
		for(UmaPessoa p : pessoa)root.appendChild(p.getXML());
		Document doc = new Document(root);
		format(System.out, doc);
		format(new BufferedOutputStream(new FileOutputStream("Pessoa.xml")), doc);
	}
}
