package OOP;

public class Student {
    int id, phone;
    String name, gender;

    // For setting student's information
    void setInfo (int idNo, String stu_name, String stu_gender, int stu_phone){
        id = idNo;
        name = stu_name;
        gender = stu_gender;
        phone = stu_phone;
    }

    // For displaying student's information
     void displayInfo (){
        System.out.println("Student's Id: "+id);
        System.out.println("Student's Name: "+name);
        System.out.println("Student's Gender: "+gender);
        System.out.println("Student's Phone No: +88"+phone);
        System.out.println("\n");
    }
}
