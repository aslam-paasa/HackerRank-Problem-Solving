package _01_Foundational;

import java.util.Scanner;

public class _08_GreaterThanHundred {
    public static void main(String[] args) {   
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
        boolean ans = num > 100;
        System.out.println(ans);
    }
}
