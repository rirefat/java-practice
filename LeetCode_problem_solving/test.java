package LeetCode_problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,1};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;

        for (int num:nums){
            if (num> max){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num>secondMax && num<max) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num>thirdMax && num<secondMax) {
                thirdMax = num;
            }
        }
        int result = thirdMax==Integer.MIN_VALUE ? max : thirdMax;
        System.out.println("Third Max Number: "+result);
    }
}
