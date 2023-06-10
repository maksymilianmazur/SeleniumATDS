package Algorytmika;

import java.util.Scanner;

public class NumberReader {

    private int sumScannerNumbers = 0;
    private Scanner sc = new Scanner(System.in);



    public int inputNumbers() {
        System.out.println("Podaj liczbę : ");
        int number = sc.nextInt();


        if (number <= 100) {
            sumScannerNumbers = this.sumScannerNumbers + number;
            return this.sumScannerNumbers;
        } else {
            System.out.println("Musisz podać liczbę mniejszą od 101.");
            return this.sumScannerNumbers;
        }

    }

    public void printSumScannerNumbers() {
        System.out.println("Summed values:" + this.sumScannerNumbers);
    }

    public void checkParity() {
        int checkNumber = this.sumScannerNumbers;
        if (checkNumber % 2 == 0) {
            System.out.println("Zsumowana wartość jest parzysta.");
        } else if (checkNumber % 2 == 1) {
            System.out.println("Zsumowana wartość jest nieparzysta.");
        }

    }


}
