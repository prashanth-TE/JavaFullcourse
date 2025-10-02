package com.prashanth;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCharacterOccurance {
    public static void main(String[] args) {
        String input = "java is a programming language";
//        char[] c = s.toCharArray();
//        for (int i = 0; i <= c.length - 1; i++) {
//            int count = 1;
//            for (int j = i + 1; j <= c.length - 1; j++) {
//                if (c[i] == c[j]) {
//                    count++;
//                    c[j] = '0';
//                }
//            }
//            if (count >= 1 ) {
//                System.out.println(c[i] + " = " + count);
//            }
//
//        }
//    }
//}

//     Easy method

        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i <= input.length() - 1; i++) {
//            char key = input.charAt(i);
//            if (map.containsKey(key)) {
//                map.put(key, map.get(key) + 1);
//            } else {
//                map.put(key, 1);
//            }
//        }
        char [] c= input.toCharArray();
        for (char ch :c){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}

