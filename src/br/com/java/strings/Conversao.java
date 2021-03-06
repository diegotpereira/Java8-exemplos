package br.com.java.strings;

import java.math.*;
import java.util.*;

public class Conversao {
    
    public static void main(String[] args) {

        // ------------------------------------------
        Formatter f = new Formatter(System.out);

        char u = 'a';
        System.out.println("u = 'a'");
        f.format("s: %s%n", u);
        f.format("c: %c%n", u);
        f.format("b: %b%n", u);
        f.format("h: %h%n", u);
    

        int v = 121;
        System.out.println("v = 121");
        f.format("s: %s%n", v);
        f.format("c: %c%n", v);
        f.format("b: %b%n", v);
        f.format("h: %h%n", v);
        f.format("d: %d%n", v);
        f.format("x: %x%n", v);

        // ------------------------------------------------------------

        BigInteger w = new BigInteger("50000000000000");
        System.out.println("w = new BigInteger(\"50000000000000\")");
        f.format("s: %s%n", w);
        // f.format("c: %c%n", w);
        f.format("b: %b%n", w);
        f.format("h: %h%n", w);
        f.format("d: %d%n", w);
        f.format("x: %x%n", w);

        // -----------------------------------------------------------
        double x = 179.543;
        System.out.println("x = 179.543");
        f.format("s: %s%n", x);
        // f.format("c: %c%n", x);
        f.format("b: %b%n", x);
        f.format("h: %h%n", x);
        // f.format("d: %d%n", x);
        // f.format("x: %x%n", x);

        

        // ------------------------------------------------------------
        boolean z = false;
        System.out.println("z = false");
        f.format("s: %s%n", z);
        // f.format("c: %c%n", z);
        f.format("b: %b%n", z);
        f.format("h: %h%n", z);
        // f.format("d: %d%n", z);
        // f.format("x: %x%n", z);

    }
}
