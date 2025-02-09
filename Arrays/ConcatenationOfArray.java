package Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        System.out.println(Arrays.toString(concatenation(nums)));
    }
    static int [] concatenation(int [] nums){
        int[] ans = new int[2*nums.length];

        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
