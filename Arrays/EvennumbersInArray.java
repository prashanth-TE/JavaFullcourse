package Arrays;

public class EvennumbersInArray {
    public static void main(String[] args) {
        int[] a = {2, 33, 45, 1233, 55555, 333533};
        int ans = findNumbers(a);
        System.out.println(ans);

    }

    static int findNumbers(int[] a) {
        int count = 0;
        for (int num : a) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

//    method to check if number has even digits or not
    static boolean even(int num) {
        int count = numberOfDigits(num);
        return count % 2 == 0;

    }

//    method return count of digits in the number
    static int numberOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
