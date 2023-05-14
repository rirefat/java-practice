package LeetCode_problem_solving;

public class PerformingOperations {
    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X","X--"};
        int x = 0;

        for(String operation:operations){
            if(operation.equalsIgnoreCase("++x") || operation.equalsIgnoreCase("x++")){
                x++;
            }
            else if(operation.equalsIgnoreCase("--x") || operation.equalsIgnoreCase("x--")){
                x--;
            }
        }

//        Alternative solution
//        int x = 0;
//        for(String op:operations){
//            if(op.equalsIgnoreCase("++x") || op.equalsIgnoreCase("x++")) x++;
//            else  x--;
//        }

        System.out.println(x);
    }
}
