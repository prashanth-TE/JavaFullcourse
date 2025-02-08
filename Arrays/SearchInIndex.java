package Arrays;

public class SearchInIndex {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 6, 33, 31};
        int target = 2;
        System.out.println(searchInIndex(a, target, 1, 4));
    }

    static int searchInIndex(int[] a, int target, int start, int end) {
        if (a.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (target == a[index]) {
                return index;
            }
        }
        return -1;
    }
}
