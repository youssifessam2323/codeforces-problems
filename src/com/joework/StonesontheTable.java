package com.joework;

import java.util.Scanner;

public class StonesontheTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = Integer.valueOf(sc.nextLine());
        int count = 0;
        String stones = sc.nextLine();

        System.out.println(stones);
        for (int i = 0; i < length; i++) {
                if(i == length - 1 ){
                    break;
                }
                if(stones.charAt(i) == stones.charAt(i + 1)){
                    count++;
                }
        }

        System.out.println(count);
    }
}
