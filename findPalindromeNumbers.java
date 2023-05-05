// Check palindrome numbers from an initial number from ending number. Also print total palindrome numbers.

import java.util.Scanner;

public class findPalindromeNumbers {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter initial number: ");
        int m = input.nextInt();
        System.out.print("Please enter ending number: ");
        int n = input.nextInt();
        int count=0;

        for (int i=m; i<=n; i++){
            int temp=i,r;
            int sum=0;
            while (temp != 0){
                r = temp%10;
                sum = sum*10+r;
                temp = temp/10;
            }
            if(i==sum){
                System.out.print(i+" ");
                count++;
                sum=0;
            }
        }
        System.out.println(" ");
        System.out.println("Total Palindrome numbers: "+count);
    }
}
