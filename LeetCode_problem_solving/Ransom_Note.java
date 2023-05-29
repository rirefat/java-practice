package LeetCode_problem_solving;

import java.util.ArrayList;
import java.util.Collections;

public class Ransom_Note {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "refat";
        int[] count = new int[26];
        for(char ch: magazine.toCharArray()) {
            System.out.println(count[ch - 'a']++);
//            System.out.println(count[ch - 'a']++);

        }
    }
}
