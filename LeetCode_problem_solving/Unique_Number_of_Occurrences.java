package LeetCode_problem_solving;

import java.util.HashSet;

public class Unique_Number_of_Occurrences {
    public static void main(String[] args) {
        int[] arr = {3,5,-2,-3,-6,-6};
        HashSet<Integer> container = new HashSet<>();
        boolean res = false;

        for (int x:arr){
            if (container.contains(x)){
                res = true;
                break;
            }
            else {
                container.add(x);
            }
        }
        System.out.println(res);
    }
}
