package com.prashanth;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature in celcius: ");
        float tempC = s.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + tempF);
    }
}
