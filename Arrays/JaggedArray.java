package Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 3, 4, 5,},
                {22, 33},
                {9, 7, 5},
        };

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }

    }
}
