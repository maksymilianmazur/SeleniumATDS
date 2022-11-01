package test;

import org.junit.Test;

public class method {


    double countTrapezaoidField(double firstBase,double secondBase,double height)
    {
        double trapezoidField = ((firstBase+secondBase)*height)/2;
        return trapezoidField;
    }

    @Test
    public void endTest()
    {
        double firstTrapezoidField = countTrapezaoidField(2,4,5);
        System.out.println("Value of trapezoid field:"+ firstTrapezoidField);
    }



}
