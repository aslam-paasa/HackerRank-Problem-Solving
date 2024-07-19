package _02_ConditionalStatement;

import java.util.Scanner;

public class _10_PrintFinalZ {
    public static void main(String[] args) {
        /**
         * https://www.hackerrank.com/contests/nov22-fs-10b/challenges/print-final-z
         * */ 

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        if(x >= 20) {
            if(y >= 100) {
                z += 100;
            } else if(y >= 50) {
                z += 50;
            } else {
                z += 10;
            }
        } else {
            if(y >= 100) {
                z += 3;
            } else if(y >= 50) {
                z += 2;
            } else {
                z += 1;
            }
        }
        System.out.println(z);
    }
}
