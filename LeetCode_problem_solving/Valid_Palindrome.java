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
        String s = "0P";
        ArrayList<Character> alphabets = new ArrayList<>();
        String sorted = "";

        for (char c='a'; c<='z'; c++){
            alphabets.add(c);
        }

//        for (int i =0; i<10; i++){
//            String numericSTR = Integer.toString(i);
//            numeric.add(numericSTR);
//            newSum += numericSTR;
//        }
//        String[] numeric = {"0","1","2","3","4","5","6","7","8","9"};
        String numeric = "0123456789";
//        System.out.println(numeric.contains("5"));

        for (int i=0; i<s.length(); i++){

            char singleChr = s.toLowerCase().charAt(i);
            int numericIndex = numeric.indexOf(singleChr);
//            System.out.println(singleChr);
//            if(alphabets.contains(singleChr)) sorted += singleChr;
//            sorted = (alphabets.contains(singleChr) && numeric.contains(singleChr)) ? sorted+singleChr : sorted;
            if(alphabets.contains(singleChr)){
                sorted += singleChr;
            }
            else if(numericIndex != -1){
                sorted += singleChr;
            }
        }

        StringBuffer str = new StringBuffer(sorted);
        String inverted = str.reverse().toString();

//        if(inverted.equals(sorted)){
//            System.out.println("Result: Palindrom String");
//        }
//        else{
//            System.out.println("Result: Not Palindrom String");
//        }
        boolean palindrome = inverted.equals(sorted) ? true : false;
        System.out.println(palindrome);
    }
}
