package com.prashanth;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the name : ");
        String name = scanner.nextLine();
        name = "Hello " + name;
        System.out.println(name);
    }
}
