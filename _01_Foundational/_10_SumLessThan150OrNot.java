package _01_Foundational;

import java.util.Scanner;

public class _10_SumLessThan150OrNot {
    public static void main(String[] args) {
        /**
         * Input:
         * => x = 20, y = 30, z = 50
         * => 20 + 30 + 50 < 150 (true)
         * */ 

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        System.out.println(x + y + z < 150);
    }
}
