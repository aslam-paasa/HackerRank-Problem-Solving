package _02_ConditionalStatement;

import java.util.Scanner;

public class _04_ShopDiscount {
    public static void main(String[] args) {
        /**
         * 1. Total Cost > 1000
         * 2. Discount = 10% => totalCost/10
         * 3. No of units = 15 unit
         * 4. Price = 100rs each
         * 
         * 5. Total Cost = noOfUnits * 1000
         * 
         * Cost = noOfUnits * 1000
         *            = 15 * 100
         *            = 1500
         * 
         * Discount = 1500 / 10
         *          = 150
         * 
         * Total Cost = 1500 - 150
         *            = 1350
         * */ 

        Scanner scn = new Scanner(System.in);
        
        int units = scn.nextInt();
        int totalCost = units * 100;

        if(totalCost > 1000) {
            int discount = totalCost / 10;
            // totalCost = totalCost - discount;
            totalCost -= discount;
        }
        System.out.println(totalCost);
    }
}
