package _02_ConditionalStatement;

import java.util.Scanner;

public class _02_AdultOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int age = scn.nextInt();

        if(age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Below age");
        }
    }
}
