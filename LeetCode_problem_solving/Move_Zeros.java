/*
283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.



Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

* */
package LeetCode_problem_solving;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Move_Zeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,0,3,12,1,0,3,12,0,3,12};
        int len = nums.length;
        int count = 0;

        ArrayList<Integer> result = new ArrayList<>(len);
        for (int num:nums){
            if(num != 0){
                result.add(num);
            }
            else {
                count++;
            }
        }
        for (int i=0; i<count; i++){
            result.add(0);
        }

//        int[] outputArray = new int[output.size()];
//        int index = 0;
//        for (int x:output){
//            outputArray[index] = x;
//            index++;
//        }
        int[] output = new int[result.size()];
        int index = 0;
        for (int x:result){
            output[index] = x;
            index++;
        }

        for (int i:output){
            System.out.println(i);
        }
//        System.out.println(result);
    }
}
