package LeetCode_problem_solving;

import java.util.ArrayList;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 3;
        ArrayList<Integer> container = new ArrayList<>(nums.length);
        if(nums.length >= k){
            int count = k;
            while (count != 0){
                container.add(nums[nums.length-count]);
                count--;
            }
            for (int i=0; i<nums.length-k; i++){
                container.add(nums[i]);
            }
            for(int x=0; x<nums.length; x++){
                nums[x]=container.get(x);
            }
        }
        System.out.println(container);
    }
}
