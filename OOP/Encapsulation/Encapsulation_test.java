package OOP.Encapsulation;

public class Encapsulation_test {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setPerson("Refat", 25);

        String personName = person1.getName();
        int personAge = person1.getAge();

        System.out.println("Name: "+personName);
        System.out.println("Age: "+personAge);
    }
}
