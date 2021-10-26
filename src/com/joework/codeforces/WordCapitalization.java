package com.joework.codeforces;

import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder word = new StringBuilder(sc.nextLine());
        char c = word.charAt(0);
        if(c >= 97) {
            c -= 32;
            word.setCharAt(0, c);
        }
        System.out.println(word);
    }

}
