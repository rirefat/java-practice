package LeetCode_problem_solving;

import java.util.ArrayList;
import java.util.List;

public class Greatest_Number_Candy {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        int max = 0;
        List<Boolean> output = new ArrayList<>();
        for (int candy:candies){
            max = Math.max(candy, max);
        }
        for(int candy:candies){
            output.add(candy+extraCandies >= max);
        }
        System.out.println(output);
    }
}
