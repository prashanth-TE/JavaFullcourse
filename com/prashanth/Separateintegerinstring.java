package com.prashanth;

public class Separateintegerinstring {
    public static void main(String[] args) {
        String s= "nu4834fnf493k";
        String alphabets="";
        String integers ="";
        s=s.toUpperCase();
        for (int i=0;i<s.length()-1;i++){
            char c= s.charAt(i);
            if (c>='A' && c<='Z'){
                alphabets+=c;
            }
            else {
                integers+=c;
            }
        }
        System.out.println(alphabets);
        System.out.println(integers);
    }
}
