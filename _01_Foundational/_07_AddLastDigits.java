package _01_Foundational;

import java.util.Scanner;

public class _07_AddLastDigits {
    public static void main(String[] args) {
        
        /**
         * Q. How to remove last digit:
         * => (a) 2357 / 10 = 235
         * => (b) 2357 % 10 = 7 (mod)
        */

        Scanner scn = new Scanner(System.in);
        
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int digit1 = num1 % 10;
        int digit2 = num2 % 10;

        System.err.println(digit1 + digit2);
    }
}
