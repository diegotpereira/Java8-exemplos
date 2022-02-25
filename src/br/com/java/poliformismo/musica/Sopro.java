package br.com.java.poliformismo.musica;

public class Sopro extends Instrumento{

    @Override
    public void play(Nota n) {
        
        super.play(n);
        System.out.println("Sopro.play() " + n);
    }
}
