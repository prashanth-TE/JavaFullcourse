package com.prashanth;

import java.util.HashMap;
import java.util.Map;

public class FirstnonRepeatingChar {
    public static void main(String[] args) {
        String s= "swiiss";
        Map<Character,Integer>  map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (map.get(ch)==1){
                System.out.println("first non repeating character is : " + ch);
                break;
            }
        }
    }
}
