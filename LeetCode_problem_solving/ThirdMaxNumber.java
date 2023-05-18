/*
414. Third Maximum Number
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Example 2:
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
* */

package LeetCode_problem_solving;

import java.util.Arrays;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1,6,9,5,6,11,11};

        int max = Integer.MIN_VALUE, sMax = Integer.MIN_VALUE, tMax = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > max) {
                tMax = sMax;
                sMax = max;
                max = i;
            } else if (i > sMax && i < max) {
                tMax = sMax;
                sMax = i;
            } else if (i > tMax && i < sMax ) {
                tMax = i;
            }
        }
        int result = tMax == Long.MIN_VALUE ? max : tMax;
        System.out.println(result);
//        System.out.println(tMax == Long.MIN_VALUE ? max : tMax);
    }
}
