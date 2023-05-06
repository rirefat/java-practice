import java.util.Scanner;

public class sumOfDiagonal_Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];

        // Taking the values of matrix from user
        System.out.println("Give the values for matrix: ");
        for (int row=0; row<size; row++){
            for (int col=0; col<size; col++){
                System.out.printf("Matrix [%d][%d] : ",row,col);
                matrix[row][col] = input.nextInt();
            }
        }

        // Printing the main matrix
        System.out.println("Your given matrix: ");
        for (int row=0; row<size; row++){
            for (int col=0; col<size; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }

        // Diagonal elements of the matrix. *** In diagonal elements row and col are same ***
        int sum = 0;
        System.out.print("Diagonal Elements: ");
        for (int row=0; row<size; row++){
            for (int col=0; col<size; col++){
                if(row==col){
                    System.out.print(matrix[row][col]+" ");
                    sum += matrix[row][col];
                }
            }
        }
        System.out.println();
        System.out.println("Sum of diagonal elements: "+sum);
    }
}
