/*
* Task Descriptions:
* At first take row and column numbers from user. According to the row and column numbers,
*  - take all the values for two matrix
*  - find the sum of the two matrix.
*  - Print all the matrix including their result*/
import java.util.Scanner;

public class sum2dArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int r = input.nextInt();
        System.out.print("Enter column number: ");
        int c = input.nextInt();

        // Getting values for matrix A
        int[][] matrixA = new int[r][c];
        System.out.println("Give values for A matrix:");
        for (int row=0; row<r; row++){
            for (int col=0; col<c; col++){
                System.out.printf("Matrix A [%d][%d]= ",row, col);
                matrixA[row][col] = input.nextInt();
            }
        }
        System.out.println();

        // Getting values for matrix B
        int[][] matrixB = new int[r][c];
        System.out.println("Give values for B matrix:");
        for (int row=0; row<r; row++){
            for (int col=0; col<c; col++){
                System.out.printf("Matrix B [%d][%d]= ",row,col);
                matrixB[row][col] = input.nextInt();
            }
        }
        System.out.println();

        // Printing all the values of matrix A
        System.out.print("Matrix A: ");
        for (int row=0; row<r; row++){
            for (int col=0; col<c; col++){
                System.out.print(matrixA[row][col]+" ");;
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix B: ");
        // Printing all the values of matrix B
        for (int row=0; row<r; row++){
            for (int col=0; col<c; col++){
                System.out.print(matrixB[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // Sum of two matrix
        int[][] sum = new int[r][c];
        for (int row=0; row<r; row++){
            for (int col=0; col<c; col++){
                sum[row][col] = matrixA[row][col] + matrixB[row][col];
            }
        }

        // Printing of the result
        System.out.println("MatrixA + MatrixB : ");
        for (int row=0; row<r; row++){
            for (int col=0; col<c; col++){
                System.out.print(sum[row][col]+" ");
            }
            System.out.println();
        }
    }
}
