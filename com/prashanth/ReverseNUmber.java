package com.prashanth;

public class ReverseNUmber {
    public static void main(String[] args) {
        int n = 12345;
        int ans = 0;
        while (n != 0) {
            int temp = n % 10;

            ans = ans * 10 + temp;
            n = n / 10;
        }
        System.out.println(ans);
    }

}
