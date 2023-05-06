public class array2D {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3]; // declaring 2d array: 2row and 3 cols

        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[0][2] = 30;
        numbers[1][0] = 40;
        numbers[1][1] = 50;
        numbers[1][2] = 60;

        for(int row=0; row<2; row++){
            for (int col=0; col<3; col++){
                System.out.print(numbers[row][col]+" ");
            }
            System.out.println();
        }
    }
}
