package com.prashanth;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Java is programming language";
//        char[] c= name.toCharArray();
//        for(int i=c.length-1;i>=0;i--){
//            System.out.print(c[i]);
//        }

        String [] s = name.split(" ");
        for (int i=0;i<=s.length-1;i++){
            String s1 = s[i];
            String rev ="";
            for (int j=s1.length()-1;j>=0;j--){
                rev+=s1.charAt(j);
            }
            System.out.print(rev +" ");
        }
    }
}
