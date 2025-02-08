package Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] a = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        maximumWealth(a);

    }

    static void maximumWealth(int[][] a) {
        int max = Integer.MIN_VALUE;
        for (int[] customer : a) {
            int sum = 0;
            for (int j : customer) {
                sum += j;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);

    }
}
