package com.company;

import java.util.Scanner;

public class Main {
    static String  scanLine() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    static long power(int base, int exp){
        long pow = 1;
        if (exp == 0) return 1;
        else
            for(int i =  0; i < exp; ++i){
                pow *= base;
            }
        return pow;
    }
    public static void main(String[] args) {
        int a, b;
        System.out.println("Algorithm for calculating the power");
        System.out.println("Write the base:" );
        a = Integer.parseInt(scanLine());
        System.out.println("Write the exponent:" );
        b = Integer.parseInt(scanLine());
        if (b < 0) {
            b = -b;
            System.out.println( a + " raised to the power of " + b + " is 1/" + power(a,b));
        }
        else
            System.out.println(a + " raised to the power of " + b + " is " + power(a,b));
    }
}
