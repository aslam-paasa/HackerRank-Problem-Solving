package _01_Foundational;

import java.util.Scanner;

public class _03_JavaStdinAndStdout {
    public static void main(String[] args) {

        /**
         * Link: https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
         * */ 

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        
        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine(); // go to next line
        String s = scan.next();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
