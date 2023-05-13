/*
1945. Sum of Digits of String After Convert

You are given a string s consisting of lowercase English letters, and an integer k.

First, convert s into an integer by replacing each letter with its position in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the integer by replacing it with the sum of its digits. Repeat the transform operation k times in total.

For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the following operations:

Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
Transform #2: 17 ➝ 1 + 7 ➝ 8
Return the resulting integer after performing the operations described above.

* */

package LeetCode_problem_solving;

import java.util.ArrayList;

public class sumof_digitsOf_string {
    public static void main(String[] args) {
        String s ="abc";
        int k = 2;

        String finalConvert = "";
        int count = 0;
        int sum = 0;
        ArrayList<Character> alphabets = new ArrayList<>();
        char c;
        for(c='a'; c<='z'; c++){
            alphabets.add(c);
        }

        for(int i=0; i<s.length(); i++){
            int serialNo = alphabets.indexOf(s.charAt(i)) + 1;
//            System.out.println("Serial of "+s.charAt(i)+":"+ serialNo);
            String convert = Integer.toString(serialNo);
            finalConvert += convert;
        }
//        System.out.println(finalConvert);
        long serials = Integer.parseInt(finalConvert);

        long temp = serials;
        while (temp!=0){
            long remainder = temp%10;
            sum += remainder;
            temp = temp/10;
        }
        System.out.println("Result: "+sum);
    }
}
