package Loops;

import java.util.Scanner;

public class LoopFirstExecise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to enter: ");
        int numbers = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter another number: ");
            sum = sum + scanner.nextDouble();
            System.out.println("Sum of input numbers:" + sum);


        }


    }


}
