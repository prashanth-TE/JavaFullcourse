package com.prashanth;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max =a;
//        Here firstly we are considering a as the maximum
        if(b>max){
            max =b;
        }
        if(c>max){
            max=c;
        }

        System.out.println("The largest value is : " + max);
    }
}
