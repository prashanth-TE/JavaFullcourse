package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 9,4};
//        swap(a, 1, 3);
//    we can use swap method to reverse the array as well
        reverse(a);
        System.out.println(Arrays.toString(a));

    }

    static void reverse(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            swap(a, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
