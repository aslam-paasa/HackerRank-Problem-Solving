package _01_Foundational;

import java.util.Scanner;

public class _01_JavaStdinAndStdout {
    public static void main(String[] args) {
        /**
         * Link: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
         * (a) stdin (standard input) => keyboard input
         * (b) stdout (standard output) => monitor/screen
         * */ 

        Scanner scn = new Scanner(System.in);

        /**
         * Approach-1: All at once
        */
        int val1 = scn.nextInt();
        int val2 = scn.nextInt();
        int val3 = scn.nextInt();

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
    }
}
