package br.com.java.strings;

public class ExcecaoBancoDados extends Exception{

    public ExcecaoBancoDados(int transacaoID, int consultaID, String mensagem) {
        super(String.format("(t%d, q%d) %s", transacaoID, consultaID, mensagem));
    }
    public static void main(String[] args) {
        try {
            throw new ExcecaoBancoDados(3, 7, "Falha na gravação");
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
