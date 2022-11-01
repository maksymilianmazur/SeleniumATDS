package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args)
    {
        int password = 1111;
        System.out.println("Password:");
        int providedPassword = 0;
        try(Scanner scanner = new Scanner(System.in)){
            providedPassword = scanner.nextInt();
        } catch (InputMismatchException e) // jaki rodzaj błędu ma zostać obsłużony
        {
            e.printStackTrace();
        }

        if(password==providedPassword)
        {
            System.out.println("You've been logged in.");
        }
        else
        {
            System.out.println("Incorrect password.");
        }
        System.out.println("End of the program.");
    }
}

