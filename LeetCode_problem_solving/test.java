package LeetCode_problem_solving;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Arrays.sort(nums);
        boolean res = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                res = true;
            }
        }
        System.out.println(res);
    }
}
