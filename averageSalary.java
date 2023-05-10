public class averageSalary {
    public static void main(String[] args) {
        int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        int max = salary[0];
        int min = salary[0];
        double sum = 0;
        double count = 0;
        for(int amount:salary){
            if(amount>max){
                max=amount;
            }
            else if(amount<min){
                min = amount;
            }
        }

        for(int amount: salary){
            if(amount != min && amount != max){
                sum += amount;
                count++;
            }
        }
        double average = sum/count;
        System.out.println(min);
        System.out.println(max);
        System.out.println("Average: "+average);
    }
}
