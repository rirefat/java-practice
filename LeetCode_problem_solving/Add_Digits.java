/*
258. Add Digits: Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0
* */
package LeetCode_problem_solving;

public class Add_Digits {
    public static void main(String[] args) {
        int num =0;
        int res = num;
        while (res>9){
            res = addNums(res);
        }
        System.out.println(res);
    }static int addNums(int digit){
        int temp = digit;
        int sum = 0;

        while(temp != 0){
            int remainder = temp%10;
            sum += remainder;
            temp /= 10;
        }
        return sum;
    }


}
