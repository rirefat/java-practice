package OOP;

public class Constructor_Demo {
    public static void main(String[] args) {
        PersonConstructor person1 = new PersonConstructor("Rafiul", 25,1724565656);
        person1.displayInfo();
        PersonConstructor person2 = new PersonConstructor();
        PersonConstructor person3 = new PersonConstructor("Refat", 24);
        person3.displayInfo();
    }
}
