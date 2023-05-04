//Take an input from user and print the number containing that position from fibonacci series. Also print fibonacci series.

import java.util.Scanner;

public class nThValueOfFibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which value do you want to see: ");
        int n = input.nextInt();

        int first = 0;
        int second = 1;
        int fibo=0;

        System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i = 3; i<=n; i++){
            fibo = first+second;
            System.out.print(fibo+" ");
            first=second;
            second=fibo;
        }
        System.out.println(" ");
        System.out.println("The number is: "+fibo);
    }
}
