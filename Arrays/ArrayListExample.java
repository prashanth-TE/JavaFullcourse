package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(4);
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        System.out.println(list);

        System.out.println("Add the objects into an arraylist");
        for (int i=0;i<=10;i++){
            list.add(in.nextInt());
        }

//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        System.out.println(list);

    }
}
