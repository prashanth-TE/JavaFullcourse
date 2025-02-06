package Arrays;

import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args) {
//        int[] a = new int[3];
//        a[0] = 1;
//        a[1] = 33;
//        a[2] = 44;
////  [1,33,44]
//        for (int i = 0; i <= a.length - 1; i++) {
//            System.out.print(a[i] + ", ");
//        }
//        or directly we can declare and initialize in a same lines

//        input using for loop;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = in.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the values into am array");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int num : a){
            System.out.print(num + " ");
        }
    }
}
