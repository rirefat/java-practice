package LeetCode_problem_solving;

public class Construct_the_Rectangle {
    public static void main(String[] args) {
        int area = 122122;
        int wid = (int) Math.sqrt(area);
        while (area%wid != 0){
            wid--;
        }
        int hig = area/wid;
        System.out.println(new int[] {wid, hig});
    }
}
