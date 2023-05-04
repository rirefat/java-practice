// Take positive input from user and reverse it.

import java.util.Scanner;

public class reverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Positive number: ");
        int num = input.nextInt();
        int temp = num;
        int sum = 0;
        int r;

        while (temp != 0){
            r = temp%10;
            sum = sum*10+r;
            temp = temp/10;
        }
        System.out.println("Result: "+sum);
    }
}
