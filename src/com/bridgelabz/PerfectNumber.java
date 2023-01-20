package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (n == sum) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}