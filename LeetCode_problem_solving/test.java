package LeetCode_problem_solving;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String magazine = "aab";
        int[] alphabets = new int[26];
        for(char c:magazine.toCharArray()){
            System.out.println(alphabets[c-'a']++);
        }
    }
}
