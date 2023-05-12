package OOP;

public class objectClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "Rabiul Islam";
        teacher1.age = 60;
        teacher1.gender = "Male";
        teacher1.phone = 1785085850;

        System.out.println("Name: "+teacher1.name);
        System.out.println("Age: "+teacher1.age);
        System.out.println("Gender: "+teacher1.gender);
        System.out.println("Phone: +880"+teacher1.phone);
    }
}
