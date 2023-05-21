public class Variable_Argument {
    static void display(String ... names){
        for (String name:names){
            System.out.print(name+" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        display("Rafiul", "Refat", "Islam");
        display("Raihan", "Mahmud");
    }
}
