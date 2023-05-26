package LeetCode_problem_solving;

public class Can_Place_Flower {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        int zeros = 1, ans = 0;
        for (int i = 0; i < flowerbed.length; i ++) {
            if (flowerbed[i] == 0) {
                zeros++;
            } else {
                ans += (zeros - 1) / 2;
                zeros = 0;
            }
        }
        System.out.println(ans + zeros / 2 >= n);
    }
}
