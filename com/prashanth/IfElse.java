package com.prashanth;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the salary : ");
        int salary = input.nextInt();
        if(salary > 10000){
            salary = salary + 2000;
        }
        else {
            salary = salary + 1000;
        }
        System.out.println("Salary : " + salary);
    }
}
