package br.com.java.serializacao;

import java.io.*;

public class CongelarAlien {
    public static void main(String[] args) throws Exception {
        try (
            ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("X.file"));
                
        ) {
            Alien quellek = new Alien();
            out.writeObject(quellek);
        }
    }
}
