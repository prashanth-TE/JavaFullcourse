package com.prashanth;

public class Demo {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int res =0;
        try {
             res = a/b;
            System.out.println("from try block");
        }
       catch (Exception e){
           System.out.println(e);
//           System.out.println("exception handled");

       }
        System.out.println(res);

        }
    }

