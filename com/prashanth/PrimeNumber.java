package com.prashanth;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
//        int result = isPrime(number);
//        if (result <= 1 && result != 0) {
//            System.out.println("please enter the number more than 1 ThankYou");
//        } else if (result != 0) {
//            System.out.println(number + " is a Prime Number");
//        } else {
//            System.out.println(number + " is Not a Prime Number");
//        }
//
//    }
//
//    public static int isPrime(int number) {
//        int c = 2;
//        if (number < c) {
//            return number;
//
//        }
//        for (int i = c; i < number * number; i++) {
//            if (number % c == 0) {
//                return 0;
//            }
//        }
//        return number;
//    }
//
//}

//
//        if (number <= 1) {
//            System.out.println(number + " : is neither prime nor composite");
//        }
//        int c = 2;
//        while (c * c <= number) {
//            if (number % c == 0) {
//                System.out.println(number + " is not a prime number");
//                break;
//            }
//            c++;
//        }
//        if (c * c > number && number != 1) {
//            System.out.println(number + " is a prime number");
//        }
//    }
//}

// A number is said to be prime if it is only divisible by 1 and itself.
// example :- 17 is a prime number because it is only divisible by 1 and 17 only.


        if (isPrime(number)) {
            System.out.println("Prime number");
        } else {
            System.out.println("not a prime number");
        }
    }

     static  boolean isPrime( int number){

            if (number <= 1) {
                return false;
            }
            for (int i=2;i<number;i++){
                if (number%i==0){
                    return false;
                }
            }
            return true;
        }

    }