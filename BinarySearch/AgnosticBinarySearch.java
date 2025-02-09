package BinarySearch;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9, 33, 365, 666};
        int target = 33;
        System.out.println(orderAgnosticBS(arr, target));

    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

