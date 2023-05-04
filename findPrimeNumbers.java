/*
Take two numbers from user and find the prime numbers between those two numbers.
 */

import java.util.Scanner;

public class findPrimeNumbers {
    public static void main(String[] args) {
        int count=0;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Please input initial number: ");
        int num1 = input1.nextInt();
        System.out.print("Please input ending number: ");
        int num2 = input2.nextInt();

        if(num1>0 && num2>0){
            for(int i=num1; i<=num2; i++){
                for(int x=2; x<i; x++){
                    if(i%x==0){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    System.out.println(i);
                }
                count=0;
            }
        }
        else{
            System.out.println("Please give positive number.");
        }
    }
}
