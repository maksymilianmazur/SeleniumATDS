package test;

import org.junit.Test;

public class Tablice {

    @Test
    public void testTable()
    {
    String test = "test";
    System.out.println(test);
    String[] tableString = new String[5];

    tableString[0] = "Merkury";
    //String firstPlanet = tableString[0];

    }
    @Test
    public void testTable2()
    {
        String[] secondTable = {"firstElement","secondElement","thirdElement"}; // deklaracja tablicy + inicjalizacja
        System.out.println(secondTable.length);
    }

    @Test
    public void testTable3()
    {
        int[][] thirdTable = new int[8][2]; // 8 wierszy 2 kolumny
        thirdTable[0][0] = 1;
        thirdTable[0][1] = 179;
        thirdTable[1][0] = 2;
        thirdTable[1][1] = 154;
        System.out.println(thirdTable.length);
    }
    @Test
    public void testTable5()
    {
        String[][] thirdTable = {{"1","first"},{"2","second"},{"3","third"}}; // deklaracja + inicjalizacja tablicy wielowymiarowej
        System.out.println(thirdTable);
        System.out.println(thirdTable.length);
    }

}
