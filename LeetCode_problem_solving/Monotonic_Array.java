package LeetCode_problem_solving;

public class Monotonic_Array {
    public static void main(String[] args) {
        int[] nums ={1,2,2,3,1};
        boolean increasing = false, decreasing = false;
        for (int i=1; i< nums.length; i++){
            if (nums[i]>nums[i-1]){
                increasing=true;
            } else if (nums[i]<nums[i-1]) {
                decreasing=true;
            }
        }
        boolean result = (increasing && decreasing) ? false:true;
        System.out.println(result);
    }
}
