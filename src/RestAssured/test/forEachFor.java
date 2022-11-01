package test;

import org.junit.Test;

public class forEachFor {

    int countSilnia(int number)
    {
        int silnia = 1;

        if(number>1) {
        for(int i = 2; i<=number;i++) {   //inicjalizacja, warunek, inkrementacja
            silnia = silnia*i;
        }
        }
        return silnia;
    }

    @Test
    public void count()
    {
        int silnia = countSilnia(5);
    }



    @Test
    public void forEachExample()
    {
        String [] planets = {"Merkury","Wenus","ziemia", "Mars","Jowisz", "Saturn", "Uran", "Neptun"};
        String tekst = "Planety układu słonecznego to: ";
        for(String planeta: planets){
            tekst = tekst + "\n" + planeta;
        }
        System.out.println(tekst);
    }

}
