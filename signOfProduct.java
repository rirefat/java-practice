/* Problem Statement:
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).
* */

public class signOfProduct {
    public static void main(String[] args) {
        int[] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        long product = 1;
        for (int num : nums){
            product = product * num;
        }
        if(product>0){
            System.out.println("Result: "+product);
            System.out.println(1);
        }
        else if(product < 0){
            System.out.println("Result: "+product);
            System.out.println(-1);
        }
        else{
            System.out.println("Result: "+product);
            System.out.println(0);
        }
    }
}
