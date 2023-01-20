package com.bridgelabz;

public class FibonacciSeries {

    static void fibonacci(int n) {
        int num1 = 0;
        int num2 = 1;
        int temp = 0;

        while (temp < n) {
            System.out.println(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            temp = temp + 1;
        }
    }

    public static void main(String[] args) {

        int n = 7;
        fibonacci(n);
    }
}