package com.joework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Magnets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> groups = new Stack<>();

        groups.push(sc.nextInt());
        for (int i = 1; i < n; i++) {

            int item = groups.peek();
            int nextItem = sc.nextInt();
            if(nextItem == item){
                continue;
            }else{
                groups.push(nextItem);
            }
        }
        System.out.println(groups.size());
    }

}
