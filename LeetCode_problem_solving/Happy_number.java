package LeetCode_problem_solving;

import java.util.HashSet;

public class Happy_number {
    public static void main(String[] args) {
        int n = 19;
        HashSet<Integer> track = new HashSet<>();
        while (n!=1 && !track.contains(n)){
            track.add(n);
            int sum = 0;
            while (n!=0){
                int remainder = n%10;
                sum += (remainder*remainder);
                n /= 10;
            }
            n = sum;
        }
        System.out.println( n==1 ? true : false);
    }
}
