/*
125. Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

* */
package LeetCode_problem_solving;

import java.util.ArrayList;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean response = true;

        int x = 0;
        int y = s.length()-1;
        while (x<y){
            Character head = s.charAt(x);
            Character tail = s.charAt(y);
            if (!Character.isLetterOrDigit(head)){
                x++;
                continue;
            }
            if (!Character.isLetterOrDigit(tail)){
                y--;
                continue;
            }
            if (Character.toLowerCase(head) != Character.toLowerCase(tail)){
                response = false;
            }
            x++;
            y--;
        }
        System.out.println("Is Palindrome :"+response);
    }
}
