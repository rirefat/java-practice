package OOP;

public class Student_objectClass {
    public static void main(String[] args) {
        Student student1 = new Student();  // Declaring and create student object
        Student student2 = new Student();

        // Set student's information using method
        student1.setInfo(151, "Rafiul", "Male", 1724855885);
        student2.setInfo(152, "Rakibul", "Male", 1726958874);

        // Display student's information using method
        student1.displayInfo();
        student2.displayInfo();
    }
}
