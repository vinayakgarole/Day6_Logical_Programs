package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Reverse Number");

        while (n > 0) {
            int r = n % 10;
            System.out.print(r);
            n = n / 10;
        }
    }
}