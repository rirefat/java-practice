import java.util.Scanner;

public class findDay {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Scanner input = new Scanner(System.in);
        System.out.print("Input day serial: ");
        int serial = input.nextInt();

        if(serial>0 && serial<8){
            System.out.println("Your day is: "+days[serial]);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
