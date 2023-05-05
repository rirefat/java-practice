import java.util.Scanner;

public class patternType2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input row number: ");
        int num = input.nextInt();

        for(int row=num; row>=1; row--){
            for(int col=row; col>=1; col--){
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }
    }
}
