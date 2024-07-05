package _01_Foundational;

import java.util.Scanner;

public class _04_SumAndDifferenceOfXandY {
    public static void main(String[] args) {
        /**
         * Q. You will be given two integers x and y. You have to print
         *    the sum of x and y in the first line, and the difference
         *    of x and y in the second line.
         * => First integer input should be stored in x, Second integer
         *    input should be stored in y.
         * 
         * Input: x = 40
         *        y = 10
         * 
         * Output: 50 (x+y = 40+10)
         *         30 (x-y = 40-10)
         * 
         * Link: https://www.hackerrank.com/contests/nov22-fs-10b/challenges/sum-and-difference-of-x-and-y
         * */ 

        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int y = scn.nextInt();

        int sum = x + y;
        System.out.println(sum);

        int difference = x - y;
        System.out.println(difference);
    }
}
