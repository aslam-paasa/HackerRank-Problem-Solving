package _02_ConditionalStatement;

import java.util.Scanner;

public class _06_GradeTheStudent {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int marks = scn.nextInt();

        if(marks > 90) {
            System.out.println("Excellent");
            // 91-100
        } else if(marks > 80) {
            System.out.println("Good");
            // 81-90
        } else if(marks > 70) {
            System.out.println("Fair");
            // 71-80
        } else if(marks > 60) {
            System.out.println("Meets Exceptations");
            // 61-70
        } else if(marks > 40) {
            System.out.println("Below Par");
            // 41-60
        } else {
            System.out.println("Failed");
        }
    }
}
