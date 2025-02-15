package BinarySearch;

public class FloorNUmber {
    public static void main(String[] args) {


    int[] arr = {999,973,743,283,43,22,12,9,3,1};
    int target = 99;
    int ans = binarySearch(arr, target);
        System.out.println("The floor number of " + target + " is " + ans);
}

//            static int binarySearch(int[] arr, int target) {
//                int start = 0;
//                int end = arr.length - 1;
//
//                while (start <= end) {

//             find the middle element
//             int mid = start + end /2 might not work suppose if start + end might exceed the limit of int range
//                    int mid = start + (end - start) / 2;
//                    if (target == arr[mid]) {
//                        return arr[mid];
//                    } else if (target < arr[mid]) {
//                        end = mid - 1;
//                    } else if (target > arr[mid]) {
//                        start = mid + 1;
//                    }
//
//                }
//                return arr[end];
//            }
//
//        }


//    Below code works if the given array is descending order
static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
//             find the middle element
//             int mid = start + end /2 might not work suppose if start + end might exceed the limit of int range
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return arr[mid];
        } else if (target > arr[mid]) {
            end = mid - 1;
        } else if (target < arr[mid]) {
            start = mid + 1;
        }

    }
    return arr[start];
}
}
