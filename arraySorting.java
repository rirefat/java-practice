import java.util.Arrays;

public class arraySorting {
    public static void main(String[] args) {
        // Integer sorting
        int[] numbers = {12,63,89,44,56,78,121};
        Arrays.sort(numbers);
        System.out.print("Sorted numbers: ");
        for(int nums : numbers){
            System.out.print(nums+" ");
        }
        System.out.println("\n");

        // String sorting
        String[] names = {"Refat", "Abbas", "Hamid", "Kaisar", "Poltu"};
        Arrays.sort(names);
        System.out.print("Sorted names: ");
        for (String name : names){
            System.out.print(name+" ");
        }
    }
}
