package LeetCode_problem_solving;

public class Perfect_Number {
    public static void main(String[] args) {
        int num = 7;
        int sum = 0;

        for (int i=1; i<=num/2; i++){
            if (num%i == 0){
                sum += i;
            }
        }
        if (sum==num){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
