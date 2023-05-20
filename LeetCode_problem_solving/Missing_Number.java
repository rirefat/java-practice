package LeetCode_problem_solving;

import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = {0,1};
        int expectedSum = 0;
        int sum = 0;
        int len = nums.length;

        for (int i=0; i<=len; i++){
            expectedSum += i;
        }

        for (int num:nums){
            sum += num;
        }

        int missing = expectedSum-sum;

        System.out.println("Missing Value: "+missing);

    }
}
