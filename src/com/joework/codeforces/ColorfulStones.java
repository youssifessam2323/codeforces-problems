package com.joework.codeforces;

import java.util.Scanner;

public class ColorfulStones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String wordOne = sc.nextLine();
        String wordTwo = sc.nextLine();

        int i = 0, j = 0;

        while(j < wordTwo.length()){

            if(wordTwo.charAt(j) == wordOne.charAt(i)){
                i++;
                j++;
            }else {
              j++;
            }

        }

        System.out.println(i + 1);


    }
}
