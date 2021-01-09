package com.company;

import java.util.Scanner;

public class Main {
    static String scann () {
        Scanner scan = new Scanner(System.in);
           return scan.nextLine();
    }

    public static void main(String[] args) {
        int a, b;
        long pow = 1;
        System.out.println("Algorithm for calculating the power");
        System.out.println("Write the base:" );
        a = Integer.parseInt(scann());
        System.out.println("Write the exponent:" );
        b = Integer.parseInt(scann());

        if (b == 0){
            System.out.println( a + " raised to the power of " + b + " is 1");
        }
        else if (b > 0){
            for (int i = 1; i <= b; i++){
                pow *= a;
            }
            System.out.println( a + " raised to the power of " + b + " is " + pow );
        }

        else{
            b = -b;
            for (int i = 1; i <= b; i++){
                pow *= a;
            }
            System.out.println( a + " raised to the power of " + b + " is 1/" + pow );
        }
    }
}

