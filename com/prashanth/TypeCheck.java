package com.prashanth;

import java.util.Scanner;

public class TypeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string : ");
        char c= in.next().trim().charAt(1);

        if(c >='a' && c<='z'){
            System.out.println("Lower case");
        }
        else {
            System.out.println("Upper case");
        }

    }
}
