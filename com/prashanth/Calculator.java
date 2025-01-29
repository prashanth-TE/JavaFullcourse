package com.prashanth;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Take input from users untill they press x or X
        int ans =0;
        while(true){
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
//                input two numbers
                System.out.println("Enter two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                System.out.println("Thanks for using calculator ");
                break;
            }
            else {
                System.out.println("Enter a valid operator");
            }
            System.out.println("The answer is : " + ans);

        }

    }
}
