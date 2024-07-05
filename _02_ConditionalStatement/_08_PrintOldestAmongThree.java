package _02_ConditionalStatement;

import java.util.Scanner;

public class _08_PrintOldestAmongThree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        // Nested If-Else
        if(a > b) {
            if(a > b) {
                System.out.println("A");
            } else {
                System.out.println("C");
            }
        } else {
            if(b > c) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
    }    
}
