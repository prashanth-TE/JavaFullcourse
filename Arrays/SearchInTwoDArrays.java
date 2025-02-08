package Arrays;

import java.util.Arrays;

public class SearchInTwoDArrays {
    public static void main(String[] args) {
        int[][] a = {
                {1, 33, 2},
                {44, 5, 25, 21, 66},
                {11, 42}
        };
        int target = 11;
        int[] ans = searchInTwoD(a, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchInTwoD(int[][] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (target == a[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
