package br.com.java.serializacao;

import java.io.*;
import java.util.*;

import br.com.java.comjava.Nap;

public class Entrar implements Serializable{
    
    private Date data = new Date();
    private String nomeusuario;
    private transient String senha;

    public Entrar(String nome, String pwd) {
        this.nomeusuario = nome;
        this.senha = pwd;
    }

    @Override
    public String toString() {
        return "Entrar [data=" + data + ", nomeusuario=" + nomeusuario + ", senha=" + senha + "]";
    }

    public static void main(String[] args) {
        Entrar a = new Entrar("Hulk", "password");
        System.out.println("entrar a = " + a);

        try(
            ObjectOutputStream o = 
            new ObjectOutputStream(
                new FileOutputStream("Entrar.data"))
        ) {
            o.writeObject(a);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        new Nap(1);

        try(
            ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Entrar.data"))
        ) {
            System.out.println(
                "Recuperando objeto em " + new Date());

                a = (Entrar)in.readObject();
        } catch(IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("entrar a = " + a);
    }
}
