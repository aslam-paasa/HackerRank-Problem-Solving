package _02_ConditionalStatement;

import java.util.Scanner;

public class _07_PrintOldestAmongThree {
    public static void main(String[] args) {
        /**
         * Input: a = 10, b = 20, c = 30
         * Output: C is oldest
         * */ 

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        // If-Else-If Ladder
        if(a > b && a > c) {
            System.out.println("A");
        } else if(b > c) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
