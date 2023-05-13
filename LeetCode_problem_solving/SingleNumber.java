/*
136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

* */
package LeetCode_problem_solving;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,6,3,6,3,7,9,7,9};

        int ans = 0;
        for(int n:nums){
            ans = ans^n;
        }
        System.out.println("Unique :"+ans);
    }
}
