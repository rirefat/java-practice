package LeetCode_problem_solving;

public class Two_Sum_II {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,1};
        int target = 9;
        int x = 0, y = numbers.length-1;

        while (x<y){
            int head = numbers[x];
            int tail = numbers[y];
            if (head+tail == target){
                break;
            } else if (head+tail > target) {
                y--;
                continue;
            }
            else {
                x++;
            }
        }
        System.out.println(new int[] {x+1, y+1});
    }
}
