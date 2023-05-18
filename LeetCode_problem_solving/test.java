package LeetCode_problem_solving;

public class test {
    public static void main(String[] args) {
        int n = 10;
        boolean[] seen = new boolean[n];
        int ans = 0;
        for (int num = 2; num < n; num++) {
            if (seen[num]) continue;
            ans += 1;
            for (long mult = (long)num * num; mult < n; mult += num)
                seen[(int)mult] = true;
        }
        System.out.println(ans);
    }
}
