import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int m = input.nextInt();
        int r, sum=0;
        int temp = m;

        while (temp!=0){
            r = temp%10;
            sum = sum*10+r;
            temp = temp/10;
        }

        if(sum==m){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
