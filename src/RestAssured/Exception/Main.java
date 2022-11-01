package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int password = 1111;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password:");
        int providedPassword = 0;
        try{
            providedPassword = scanner.nextInt();
        } catch (InputMismatchException e) // jaki rodzaj błędu ma zostać obsłużony
        {
            e.printStackTrace();
        }finally //służy do 'sprzątania' po wyłapaniu wyjątku
        {
            System.out.println("Cleanup.");
            scanner.close();
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

