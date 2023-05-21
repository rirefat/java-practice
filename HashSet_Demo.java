import java.util.HashSet;

public class HashSet_Demo {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        HashSet<String> cars = new HashSet<>();

        cars.add("Toyota");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Audi");

        System.out.println(cars);
    }
}
