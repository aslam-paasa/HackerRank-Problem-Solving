package _02_ConditionalStatement;

import java.util.Scanner;

public class _01_VotingAge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        System.out.println("Before Voting Day");

        if(age >= 18) {
            System.out.println("Age is Greater Than or Equal to 18");
            System.out.println("Hence You can vote");
        } else {
            System.out.println("Age is less than 18");
            System.out.println("Hence You cannot vote");
        }

        System.out.println("After Voting Day");
    }
}
