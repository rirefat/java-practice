/*
1768. Merge Strings Alternately
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
If a string is longer than the other, append the additional letters onto the end of the merged string. Return the merged string.

Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s

Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d
* */

package LeetCode_problem_solving;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";

//        int len1 = word1.length();
//        int len2 = word2.length();
//        StringBuffer str1 = new StringBuffer(word1);
//        StringBuffer str2 = new StringBuffer(word2);
//        StringBuffer finalStr = new StringBuffer("");
//
//        if(len1>len2){
//            StringBuffer rest = new StringBuffer(str1);
//            str1.delete(len2, len1);
//            rest.delete(0, len2);
//            for (int i=0; i<len2; i++){
//                finalStr.append(str1.charAt(i));
//                finalStr.append(str2.charAt(i));
//            }
//            finalStr.append(rest);
//        }
//        else if (len1<len2) {
//            StringBuffer rest = new StringBuffer(str2);
//            str2.delete(len1, len2);
//            rest.delete(0, len1);
//            for (int i=0; i<len1; i++){
//                finalStr.append(str1.charAt(i));
//                finalStr.append(str2.charAt(i));
//            }
//            finalStr.append(rest);
//        }
//        else{
//            for (int i=0; i<len1; i++){
//                finalStr.append(str1.charAt(i));
//                finalStr.append(str2.charAt(i));
//            }
//        }


//        Solution 2:
        StringBuffer finalStr = new StringBuffer("");
        int len1 = word1.length(), len2 = word2.length();
        int i = 0;

        while (i<len1 && i<len2){
            finalStr.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        finalStr.append(word1.substring(i,len1)).append(word2.substring(i,len2));

        System.out.println("Merged Result: "+finalStr);
    }
}
