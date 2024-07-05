package _01_Foundational;

import java.util.Scanner;

public class _09_xyzw {
    public static void main(String[] args) {
        /**
         * Print true if x*y is equal to z*w and false otherwise
         * 
         * Input: x = 5, y = 8, z = 10, w = 4
         * Output: x*y == z*w
         *         5*8 == 10*4
         *          40 == 40 (true)
         * */ 

        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int y = scn.nextInt();
        int w = scn.nextInt();
        int z = scn.nextInt();

        int xy = x * y;
        int zw = z * w;

        System.err.println(xy == zw);
    }
}
