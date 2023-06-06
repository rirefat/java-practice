package LeetCode_problem_solving;

import java.util.Arrays;

public class Arithmetic_Progression_From_Sequence {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        Arrays.sort(arr);
        int difference = arr[1]-arr[0];
        boolean res = true;
        int next = 0;
        for (int i=0; i< args.length; i++){
            next = arr[i]+difference;
            if (next == arr[i++]) {
                continue;
            }
            else {
                System.out.println(res=false);
            }
        }
//        System.out.println(res);
    }
}
