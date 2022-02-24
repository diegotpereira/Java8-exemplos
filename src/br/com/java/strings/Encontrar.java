package br.com.java.strings;

import java.util.regex.*;

public class Encontrar {
   public static void main(String[] args) {
    Matcher m = Pattern.compile("\\w+")
    .matcher(
        "A noite está cheia de asas do linnet");

        while(m.find())
        System.out.print(m.group() + " ");
        System.out.println();

        int i = 0;

        while(m.find(i)) {
            System.out.println(m.group() + " ");
            i++;
        }
   }
}
