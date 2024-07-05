package _01_Foundational;

import java.util.Scanner;

public class _06_FahrenheitToCelsius {
    public static void main(String[] args) {

        /**
         * Link: https://www.hackerrank.com/contests/nov22-fs-10b/challenges/fahrenheit-and-celsius
         * 
         * Fahrenheit to Celsius conversion:
         * => Celsius = (f - 32) * 5/9
         * 
         * 1. Input: 41.0
         * 2. Output: 5.0
         */

        Scanner scn = new Scanner(System.in);

        float farh = scn.nextFloat();
        float celsius = (farh - 32.00f) * 5.00f / 9.00f;

        // Format the Celsius temperature to two decimal places and print it
        System.out.println(String.format("%.2f", celsius));
    }
}
