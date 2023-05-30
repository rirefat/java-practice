package LeetCode_problem_solving;

import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        Arrays.sort(nums);
        int case1 = nums[0]*nums[1]*nums[nums.length-1];
        int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int result = Integer.max(case1, case2);
        System.out.println("Maximum Product: "+result);
    }
}
