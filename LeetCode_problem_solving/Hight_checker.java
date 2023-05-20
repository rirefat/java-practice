package LeetCode_problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

public class Hight_checker {
    public static void main(String[] args) {
        int[] heights = {1,2,3,4,5};
        int count = 0;
        int[] givenHeights = new int[heights.length];
        for (int i=0; i< heights.length; i++){
            givenHeights[i] = heights[i];
        }
        Arrays.sort(heights);

        for (int i=0; i<heights.length; i++){
            if (givenHeights[i] != heights[i]){
                count++;
            }
        }
        System.out.println("Count: "+count);
    }
}
