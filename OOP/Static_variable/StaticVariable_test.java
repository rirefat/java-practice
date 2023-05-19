package OOP.Static_variable;

public class StaticVariable_test {
    public static void main(String[] args) {
        // Object is created to use instance variable
        StaticVariable obj =  new StaticVariable();
        System.out.println(obj.str1);

        // No need to create for using static variable
        System.out.println(StaticVariable.str2);
    }
}
