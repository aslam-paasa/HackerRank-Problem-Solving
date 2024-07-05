package _01_Foundational;

import java.util.Scanner;

public class _02_JavaStdinAndStdout {
    public static void main(String[] args) {
        /**
         * Link: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
         * (a) stdin (standard input) => keyboard input
         * (b) stdout (standard output) => monitor/screen
         * */ 

        Scanner scn = new Scanner(System.in);

        /**
         * Approach-2: Taking input one at a time
        */
        int val1 = scn.nextInt();
        System.out.println(val1);

        int val2 = scn.nextInt();
        System.out.println(val2);

        int val3 = scn.nextInt();
        System.out.println(val3);             
    }
}
