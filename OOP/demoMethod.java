package OOP;

public class demoMethod {
    public static void main(String[] args) {
        // Calling method
        testMethod("Rafiul Islam");

        int result = sum(10,5);
        System.out.println(result);
    }

    // Creating method
    static void testMethod (String n){
        System.out.println("I'm "+n);
    }

    static int sum(int n, int m){
        return m+n;
    }
}

