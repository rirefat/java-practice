package OOP.Static_variable;

public class Student {
    int id;
    String name;
    static String uv_name= "BRACU";

    Student(int stu_id, String stu_name){
        id=stu_id;
        name = stu_name;
    }
    void displayInfo (){
        System.out.println("Student's Id: "+id);
        System.out.println("Student's Name: "+name);
        System.out.println("University Name: "+uv_name);
        System.out.println("\n");
    }
}


