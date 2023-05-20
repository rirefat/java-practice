package LeetCode_problem_solving;

public class test {
    public static void main(String[] args) {
        int n = 14;

        double d1 = Math.sqrt(n);
        double d2 = Math.round(d1);
        double fracValue = d1-d2;
        boolean result = Math.abs(fracValue)>0 ? false:true;
        System.out.println(result);
    }
}
