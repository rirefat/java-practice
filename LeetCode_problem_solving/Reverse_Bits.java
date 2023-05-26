/*
https://leetcode.com/problems/reverse-bits/
* */
package LeetCode_problem_solving;

public class Reverse_Bits {
    public static void main(String[] args) {
        String n = "11111111111111111111111111111101";
//        Integer decVal = Integer.parseInt(n, 2);
        StringBuffer binarySB = new StringBuffer(n).reverse();
        Integer decVal = Integer.parseInt(binarySB.toString(), 2);
        System.out.println(decVal);
    }
}
