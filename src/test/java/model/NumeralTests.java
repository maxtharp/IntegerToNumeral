package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeralTests {

    @Test
    public void singleDigitTest(){
        String numeral = IntegerToNumeral.converter(9);
        Assertions.assertEquals("IX", numeral);
    }
    @Test
    public void doubleDigitTest(){
        String numeral = IntegerToNumeral.converter(99);
        Assertions.assertEquals("XCIX", numeral);
    }
    @Test
    public void tripleDigitTest(){
        String numeral = IntegerToNumeral.converter(999);
        Assertions.assertEquals("CMXCIX", numeral);
    }
    @Test
    public void quadDigitTest(){
        String numeral = IntegerToNumeral.converter(3000);
        Assertions.assertEquals("MMM", numeral);
    }
}
