package com.pb.benera.hw4;

import java.util.Scanner;

public class CapitalLetter {
     static String toUpCase(String phrase) {
        String[] words = phrase.split (" ");
        StringBuilder output = new StringBuilder ( );
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            output.append (Character.
                            toUpperCase (temp.charAt (0))).
                    append (temp.substring (1)).
                    append (" ");
        }
        return output.toString ( );
    }

     static void toPrint() {
        Scanner input = new Scanner (System.in);
        System.out.println ("Введите строку: ");
        String answer= input.nextLine ();
        String result=toUpCase(answer);
        System.out.println(result);
    }


    public static void main(String args[]) {
        toPrint ();

    }
}
