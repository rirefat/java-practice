import java.util.Random;

public class randomValue {
    public static void main(String[] args) {
        Random rand = new Random();
        int ranVal = rand.nextInt(10); // o to 9
        System.out.println(ranVal);
    }
}
