/*
169. Majority Element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
* */
package LeetCode_problem_solving;

import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,4,4,2,1,0,5,6};
        Arrays.sort(nums);
        System.out.println(nums[nums.length/2]);
    }
}
