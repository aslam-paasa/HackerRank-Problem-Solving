package _01_Foundational;

import java.util.Scanner;

public class _05_AreaAndPerimeter {
    public static void main(String[] args) {
        /**
         * Formula:
         * 1. Area of rectangle = length * breadth
         * 2. Perimeter of rectangle = 2 * (length + breadth);
         * 
         * Link: https://www.hackerrank.com/contests/nov22-fs-10b/challenges/area-and-perimeter-5/problem
        */

        Scanner scn = new Scanner(System.in);
        
        int length = scn.nextInt();
        int breadth = scn.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
