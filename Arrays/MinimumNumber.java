package Arrays;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] a = {100, 6, 2, 66, 7, 22, 101};
        System.out.println(min(a));
    }

    static int min(int[] a) {
        int minimum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minimum) {
                minimum = a[i];
            }
        }
        return minimum;

    }
}
