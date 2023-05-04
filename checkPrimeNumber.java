// Take an integer number from user and check if it is a prime number or not

import java.util.Scanner;

public class checkPrimeNumber {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any positive integer number:");
        int userInput = input.nextInt();
        System.out.println(userInput);

        int count = 0;

        if(userInput>0){
            for(int x=2; x<=userInput/2; x++){
                if(userInput%x == 0){
                    count++;
                    break;
                }
            }
            if(count>0){
                System.out.println("Not a prime number");
            }
            else{
                System.out.println("Detected as prime number");
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
