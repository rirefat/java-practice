package LeetCode_problem_solving;

import java.util.ArrayList;
import java.util.Collections;

public class Ransom_Note {
    public static void main(String[] args) {
        String ransomNote = "baa", magazine = "aab";

        boolean response = true;
        if (ransomNote.length() > magazine.length()) response = false;
        int[] alphabets = new int[26];

        for(char c:magazine.toCharArray()){
            alphabets[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            if( alphabets[c-'a']==0 ) {
                response = false;
                break;
            }
            alphabets[c-'a']--;
        }
        System.out.println(response);
    }
}
