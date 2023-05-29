package OOP.Encapsulation;

public class Person {
    // Private data members
    private String name;
    private int age;

    // Setter method
    public void setPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getter Method
    public String getName(){
        return name;
    }public int getAge(){
        return age;
    }
}
