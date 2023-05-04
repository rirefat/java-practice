//Input a number and show the fibonacci numbers according to the input numbers
import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to see: ");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        int fibo;
        if(n>0){
            System.out.print(first+" ");
            System.out.print(second+" ");

            for(int i=3; i<=n; i++){
                fibo = first+second;
                System.out.print(fibo+" ");
                first=second;
                second=fibo;
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}

