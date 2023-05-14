package LeetCode_problem_solving;

public class Count_Odd_Numbers {
    public static void main(String[] args) {
        int low =3;
        int high=7;
        int result = 0;
        int range = (high - low) + 1;

        if(range%2 == 0) result = range/2;
        else{
            result = (low%2 != 0  && high%2 !=0) ? (range+1)/2 : (range-1)/2;
        }
        System.out.println(result);
    }
}
