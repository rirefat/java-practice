/*
1672. Richest Customer Wealth
* */
package LeetCode_problem_solving;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int richest = 0;
        int totalWealth = 0;

        for (int[] account:accounts){
            for (int wealth:account){;
                totalWealth += wealth;
                richest = Math.max(richest, totalWealth);
            }
            totalWealth=0;
        }
        System.out.println(richest);
    }
}
