package BinarySearch;

public class CeilingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 3, 23, 34, 45, 67, 567, 653,748,839,900};
        int target = 99;
        int ans = binarySearch(arr, target);
        System.out.println("The ceiling number index of " + target + " is " + ans);
    }

        static int binarySearch ( int[] arr, int target){

//       return the index the graatest number >= target
//             what if target is greater than greater number of an array
            if(target > arr[arr.length-1]){
                return -1;
            }
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
//                                 find the middle element
//                int mid = start + end /2 might not work suppose if start + end might exceed the limit of int range
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return arr[mid];
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }

            }
            return start;
        }

    }



//    Below code works if the given array is descending order
//    static int binarySearch(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
/// /             find the middle element
/// /             int mid = start + end /2 might not work suppose if start + end might exceed the limit of int range
//            int mid = start + (end - start) / 2;
//            if (target == arr[mid]) {
//                return arr[mid];
//            } else if (target > arr[mid]) {
//                end = mid - 1;
//            } else if (target < arr[mid]) {
//                start = mid + 1;
//            }
//
//        }
//        return arr[end];
//    }
//}

