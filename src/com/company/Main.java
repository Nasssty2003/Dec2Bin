package com.company;

import java.util.Scanner;

public class Main<end> {

    public static <scanner> void main(String[] args) {
        Scanner scan = (Scanner) new Scanner(System.in);
        long number = scan.nextLong();
        if ((number >= Byte.MIN_VALUE) & (number <= Byte.MAX_VALUE)){
        System.out.println ("Byte");
        } else if ((number <= Short.MAX_VALUE) & (number >= Short.MIN_VALUE)){
            System.out.println ("Short");
        } else if ((number <= Integer.MAX_VALUE ) & (number >= Integer.MIN_VALUE)){
            System.out.println ("Integer");
        }else{
            System.out.println("Long");
        }
        byte[] arr = new byte[64];
        int i = 0;
        while (number !=0) {
            arr[i] = (byte) (number % 2);
            i++;
            number = number / 2;
        }

        StringBuilder builder = new StringBuilder();
        for (int j = i-1; j>=0; j--) {
            builder.append(arr[j]);
         }
        String res = builder.toString();
        System.out.println(res);
    }

}
