package br.com.java.strings;

public class PontoDados {
    
    private String localizacao;
    private Double temperatura;

    public PontoDados(String loc, Double tem){
        localizacao = loc;
        temperatura = tem;
    }

    

    @Override
    public String toString() {
        return "PontoDados [localizacao=" + localizacao + ", temperatura=" + temperatura + "]";
    }



    public static void main(String[] args) {
        var colina = new PontoDados("Colina", 45.2);
        var vale = new PontoDados("Vale", 65.2);

        System.out.println(colina);
        System.out.println(vale);

    }
}
