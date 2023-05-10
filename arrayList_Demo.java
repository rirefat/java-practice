import java.util.ArrayList;

public class arrayList_Demo {
    public static void main(String[] args) {
        // Declaring a new arrayList
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        // adding elements without giving specific index number
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        // adding elements
        names.add("Rafiul");
        names.add("Rakib");
        names.add("Halim");
        names.add("Bashar");
        names.add("Sakib");
        names.add("Saif");


        nums.add(2, 55);   // adding elements and giving specific index number
        System.out.println("Main array list contains :"+nums);       // printing array list is so simple like below
        nums.remove(3);     // removing element from array list by index number

        System.out.println("Array list contains after removing element: "+nums);

        // clearing array list
        nums.clear();
        System.out.println("Array list contains after clearing element: "+nums);

        // checking an array list if it is empty or not
        boolean check = nums.isEmpty();
        System.out.println("Checking the array list (empty/ not empty): "+check);

        // Checking a specific element that contains in the array list
        boolean contain = names.contains("Refat");
        System.out.println("Refat is in the list: "+contain);

        // check index of an element
        int serial = names.indexOf("Sakib");
        System.out.println("The index number is: "+serial);

        // Replace element
        System.out.println("Old name list before replace: "+names);
        names.set(2, "Refat");
        System.out.println("New name list after replace : "+names);

        // Get element by index no
        String lastMember = names.get(names.size()-1);
        System.out.println("Last Member: "+lastMember);
    }
}
