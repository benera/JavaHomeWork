package com.pb.benera.hw4;

import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] chars = s1.toCharArray();
        for (char c : chars) {
            int index = s2.indexOf(c);
            if (index != -1) {
                s2 = s2.substring(0, index) + s2.substring(index + 1, s2.length());
            } else {
                return false;
            }
        }
        return s2.isEmpty();
    }

    static void toPrint() {
        Scanner input = new Scanner (System.in);
        System.out.println ("Введите строку: ");
        String answer1=input.nextLine ();
        System.out.println ("Введите еще строку: ");
        String answer2=input.nextLine ();
        boolean result = isAnagram(answer1, answer2);
        System.out.println((result) ? "Это анаграмма" : "Это не анаграмма");
    }


    public static void main(String[] args) {
        toPrint();

    }
}