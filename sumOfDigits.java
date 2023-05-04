// Ask user to give input and calculate the sum of all the digits

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive digits: ");
        int num = input.nextInt();
        int sum = 0;
        int temp = num;

        while (temp != 0){
            int remainder = temp%10;
            sum +=remainder;
            temp = temp/10;
        }
        System.out.println("Result: "+sum);
    }
}
