/*
349. Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
* */
package LeetCode_problem_solving;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        HashSet<Integer> container = new HashSet<>();
        HashSet<Integer> output = new HashSet<>();

        for (int num:nums1){
            container.add(num);
        }
        for (int num:nums2){
            if (container.contains(num)){
                output.add(num);
            }
        }

//        int[] outputArray = new int[output.size()];
//        int index = 0;
//        for (int x:output){
//            outputArray[index] = x;
//            index++;
//        }

        System.out.println(output);
    }
}
