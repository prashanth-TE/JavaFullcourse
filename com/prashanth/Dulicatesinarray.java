package com.prashanth;

import java.util.HashSet;
import java.util.Set;

public class Dulicatesinarray {
    public static void main(String[] args) {
        int [] a= {2,3,4,2,4,2,4,5,2,3,4,1,2};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i:a){
            if(seen.contains(i)){
                duplicates.add(i);
            }
            else {
                seen.add(i);
            }
        }
        System.out.println("duplicates in given array are : " + duplicates);
    }
}
