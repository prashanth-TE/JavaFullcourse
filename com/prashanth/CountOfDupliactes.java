package com.prashanth;

public class CountOfDupliactes {
    public static void main(String[] args) {

//        question is count the number of sevens or might be any number
        long n=1385757879;
        int count =0;
        while(n != 0){
            long temp = n%10;
            if (temp == 5){
               count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
