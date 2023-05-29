package LeetCode_problem_solving;

import java.util.Arrays;

public class Count_Primes {
    public static void main(String[] args) {
        int n = 10;
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        int result = 0;
        for (int i = 2; i < n; ++i) {
            if (primes[i]) {
                result++;
                for (int j = i + i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        System.out.println(result);
    }
}
