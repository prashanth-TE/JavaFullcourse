package com.prashanth;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comparetwolistandfindcommonelements {
    public static void main(String[] args) {
        int [] a1 ={2,4,6,7,43,2,2};
        int [] a2={2,65,2,5,7,1,6,3,2};

        List<Integer> common = new ArrayList<>();

        for (int i : a1) {
            for (int j = 0; j <= a2.length - 1; j++) {
                if (a2[j] == i) {
                    if (!common.contains(i)) {
                        common.add(i);
                    }
                }
            }
        }
        System.out.println(common);
    }
}
