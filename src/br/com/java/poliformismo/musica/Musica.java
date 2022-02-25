package br.com.java.poliformismo.musica;

public class Musica {
    
    public static void tune(Instrumento i) {

        i.play(Nota.C_maior);
    }
    public static void main(String[] args) {
        Sopro flauta = new Sopro();
        tune(flauta);
    }
}
