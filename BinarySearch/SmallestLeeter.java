package BinarySearch;

public class SmallestLeeter {
    public static void main(String[] args) {


        char [] arr = {'a','c','i','l'};
        char target = 'j';
        char ans = binarySearch(arr, target);
        System.out.println( ans);
    }

    static char binarySearch(char [] arr,  char target) {

        int start = 0;
        int end = arr.length - 1;
        int n= arr.length;

        while (start <= end) {
//                                 find the middle element
//                int mid = start + end /2 might not work suppose if start + end might exceed the limit of int range
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        if (start == n){
            return arr[0];
        }

       return arr[start];
    }

}

