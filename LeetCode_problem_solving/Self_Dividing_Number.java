package LeetCode_problem_solving;

import java.util.ArrayList;

public class Self_Dividing_Number {
    public static void main(String[] args) {
        int left = 10, right = 25;
        ArrayList<Integer> output = new ArrayList<>();
        for (int i=left; i<=right; i++){
            if (checkNumber(i)){
                output.add(i);
            }
        }
        System.out.println("Output: "+output);
    }

    static boolean checkNumber (int num){
        int temp = num;
        while (temp>0){
            int remainder = temp%10;
            if (remainder == 0 || num%remainder != 0){
                return false;
            }
            temp = temp/10;
        }
        return true;
    }
}
