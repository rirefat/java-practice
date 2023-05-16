package LeetCode_problem_solving;

public class Reverse_Vowels_String {
    public static void main(String[] args) {
        String s = "hello";
        char[] chrs = s.toCharArray();
        for (char chr:chrs){
            if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u' ){

            }
            else{
                System.out.println(chr+" is not vowel");
            }
        }
    }
}
