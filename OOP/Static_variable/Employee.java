package OOP.Static_variable;

public class Employee {
    static int count = 0;

    Employee(){
        count++;
    }

    void display(){
        System.out.println("Total employee: "+count);
    }
}
