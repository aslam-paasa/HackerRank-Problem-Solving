package _02_ConditionalStatement;

import java.util.Scanner;

public class _09_RichAdultYoung {
    public static void main(String[] args) {
        /**
         * https://www.hackerrank.com/contests/nov22-fs-10b/challenges/rich-adult-young
         * */ 

        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        int salary = scn.nextInt();

        if(age > 40) {
            if(salary >= 30000) {
                System.out.println("You are rich and young");
            } else {
                System.out.println("You are an adult");
            }
        } else {
            if(salary >= 12000) {
                System.out.println("You are rich and young");
            } else {
                System.out.println("You are young");
            }
        }
    }
}
