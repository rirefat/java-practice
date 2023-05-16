package LeetCode_problem_solving;

public class Reverse_Words {
    public static void main(String[] args) {
        String s = "the sky    is blue";
        StringBuffer res = new StringBuffer();
        String[] splitted = s.split(" ");

        for (int i = splitted.length-1; i>=0; i--){
            if(splitted[i] != ""){
                res.append(splitted[i]+" ");
            }

        }
        System.out.println(res.toString());
    }
}
