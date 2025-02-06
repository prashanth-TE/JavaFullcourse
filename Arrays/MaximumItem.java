package Arrays;

public class MaximumItem {
    public static void main(String[] args) {
        int[] a = {100, 6, 2, 66, 7, 2, 101};
        System.out.println(max(a));
    }

    static int max(int[] a) {
        int maximum = a[0];
        for (int i = 1; i < a.length ; i++) {
            if (a[i] > maximum) {
                maximum = a[i];
            }
        }
        return maximum;

    }
}
