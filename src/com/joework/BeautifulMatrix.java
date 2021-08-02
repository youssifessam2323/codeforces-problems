package com.joework;
import java.util.Scanner;

public class BeautifulMatrix {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int  oneRowIndex = 0, oneColIndex = 0;

        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 5; l++) {
                var num = Integer.parseInt(sc.next());
                if( num == 1 ) {
                    oneRowIndex = k;
                    oneColIndex = l;
                    break;
                }
            }
        }


        int min = Math.abs(oneRowIndex - 2) + Math.abs(oneColIndex - 2);

        System.out.println(min);



    }
}
