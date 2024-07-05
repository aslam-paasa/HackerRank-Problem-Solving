package _02_ConditionalStatement;

import java.util.Scanner;

public class _05_PrintBonus {
    public static void main(String[] args) {
        /**
         * Formula:
         * => if(year of service > 5)
         * => Bonus = salary * (5 / 100)
         *          = 5% of salary
         * 
         * Input: => 20000 (salary)
         *           6     (years)
         * Ouput: 1000
         * => Since the years of service is 6, so we give the bonus.
         *    Hence, the bonus is 1000.
         * */ 

        Scanner scn = new Scanner(System.in);

        int salary = scn.nextInt();
        int years = scn.nextInt();

        if(years > 5) {
            int bonus = salary * 5 / 100;
            System.out.println(bonus);
        } else {
            System.out.println(0);
        }
    }
}
