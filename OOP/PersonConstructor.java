package OOP;

public class PersonConstructor {
    String name;
    int age, phone;

    PersonConstructor(String person_name, int person_age, int person_phone){
        name = person_name;
        age = person_age;
        phone = person_phone;
    }

    void displayInfo (){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone: +880"+phone);
    }
}
