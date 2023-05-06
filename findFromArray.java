/*
Take some inputs from user and complete the following tasks:
    - At first ask user that how many numbers the user wants to input
    - Print all the numbers
    - Sum of all the numbers
    - Find max value
    - Find min value
 */

import java.util.Scanner;

public class findFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to input: ");
        int listSize = input.nextByte();
        int[] nums = new int[listSize];

        System.out.println("Give the numbers below:");
        for (int i=0; i<listSize; i++){
            nums[i] = input.nextByte();
        }

        System.out.print("Yur given numbers are: ");
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }

        double sum = 0;
        for(int i=0; i< nums.length; i++){
            sum+=nums[i];
        }
        System.out.println(' ');
        System.out.println("Sum of all the numbers: "+sum);
        double average = sum/ nums.length;
        System.out.println("Average of the numbers: "+String.format("%.2f",average));

        int max = nums[0];
        for (int i=0; i< nums.length; i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println("Max number: "+max);

        int min = nums[0];
        for (int i=0; i<nums.length; i++){
            if(min>nums[i]){
                min = nums[i];
            }
        }
        System.out.println("Min number: "+min);
    }
}
