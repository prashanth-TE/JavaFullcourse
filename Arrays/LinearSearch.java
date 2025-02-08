package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {10, 2, 44, 53, 22, 54, 32, 13};
        int target = 22;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

//    static int linearSearch(int[] nums, int target) {
//        if (nums.length == 0) {
//            return -1;
//        }
//// run a for loop
//        for (int index = 0; index < nums.length; index++) {

    /// /            check for element at every index
//            int element = nums[index];
//            if (element == target) {
//                return index;
//            }
//        }
//        this line executes if none of the above condition executes
//        therefore element not found so returning -1
//        return -1;
//    }
    static int linearSearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
          for (int element : nums)
            if (element == target) {
                return element;
            }

        return -1;
    }
}
