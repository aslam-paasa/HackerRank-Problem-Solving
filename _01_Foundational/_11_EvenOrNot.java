package _01_Foundational;

import java.util.Scanner;

public class _11_EvenOrNot {
    public static void main(String[] args) {
        /**
         * Even or not:
         * (a) even % 2 == 0
         * (b) odd % 2 == 1
         * 
         * Input:
         * => num = 22
         * 
         * Output:
         * => 22 % 2 == 0 (true) => prime
        */
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
        boolean isEven = (num % 2 == 0);
        System.out.println(isEven);

    }
}
