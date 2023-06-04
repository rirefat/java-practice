package LeetCode_problem_solving;

import java.util.Collections;

public class Is_Subsequence {
    public static void main(String[] args) {
        String s = "kau", t = "ahbgdc";

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(t.indexOf(ch) < 0){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
