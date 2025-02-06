package com.prashanth;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fruit ");

        String fruit = in.nextLine();
        switch (fruit) {
            case "mango" -> System.out.println("King of fruit");
            case "orange" -> System.out.println("Queen of fruit");
            default -> System.out.println("enjoy your fruit");
        }
    }
}
