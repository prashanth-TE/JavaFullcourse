package com.prashanth;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Prashanth";
        char[] c= name.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
    }
}
