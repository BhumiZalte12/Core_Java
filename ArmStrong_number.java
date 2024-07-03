package com.itep.corejava;

import java.util.Scanner;

public class ArmStrong_number{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it's an Armstrong number:");
        int n = sc.nextInt();
        int originalNumber = n; // Store the original number

        int len = 0;
        double sum = 0;

        // Count number of digits
        while (n != 0) {
            n = n / 10;
            len++;
        }

        // Reset n to the original number
        n = originalNumber;

        // Calculate sum of powers of digits
        while (n != 0) {
            int digit = n % 10;
            sum = sum + Math.pow(digit, len);
            n = n / 10;
        }

        // Check if the sum of powers is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
