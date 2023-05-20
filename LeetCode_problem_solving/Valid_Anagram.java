package LeetCode_problem_solving;

import java.util.Arrays;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "mnagaram";
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        s = new String(sArray);
        t = new String(tArray);

        if(s.equals(t)){
            System.out.println("Valid Anagram");
        }
        else {
            System.out.println("Not an anagram");
        }

    }
}
