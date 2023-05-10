public class stringPalindrome {
    public static void main(String[] args) {
        String s1 = "madam";
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();

        if(s1.equals(s2)){
            System.out.printf("%s is Palindrome",s1);
        }
        else{
            System.out.printf("%s is not Palindrome",s1);
        }
    }
}
