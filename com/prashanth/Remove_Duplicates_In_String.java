package com.prashanth;

import java.util.LinkedHashSet;

public class Remove_Duplicates_In_String {
    public static void main(String[] args) {
        String s = "java is programming language";
//        String s2= s.replace(" ","");
//        System.out.println(s2);
//    String res="";
//    for (int i=0;i<s.length();i++){
//        char c= s.charAt(i);
//        boolean found = false;
//
//        for (int j=0;j<res.length();j++){
//            if (res.charAt(j)==c){
//                found =true;
//                break;
//            }
//        }
//        if (found==false){
//            res +=c;
//        }
//    }
//        System.out.println(res);
//        String res = "";
//        String s1 = s.replace(" ", "");
//        char[] s2 = s1.toCharArray();
//        for (int i = 0; i < s2.length; i++) {
//            for (int j = i + 1; j < s2.length; j++) {
//                if (s2[i] == s2[j]) {
//                    s2[j] = ' ';
//                }
//            }
//        }
//        for (char c : s2) {
//            if (c != ' ') {
//                res += c;
//            }
//        }
//        System.out.println(res);


        String s1 = s.replace(" " ,"");
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : s1.toCharArray()){
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set){
            sb.append(c);
        }
        System.out.println("original String : " + s );
        System.out.println("String after removing du[plicates : " + sb);
    }
}
