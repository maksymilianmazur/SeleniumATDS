package test;

import org.junit.Test;

public class whileDoWhile {

    int countSilnia(int number)
    {
        int silnia = 1;
        int i = 2;

        if(number>1)
        {
            while(i<=number)
            {
                silnia = silnia * i;
                i++;
            }

        }
        return silnia;
    }

    @Test
    public void count()
    {
        int silnia = countSilnia(5);
    }

}
