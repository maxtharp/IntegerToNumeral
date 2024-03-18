package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeralTests {

    @Test
    public void singleDigitTest(){
        String numeral = IntegerToNumeral.converter(6);
        Assertions.assertEquals("VI", numeral);
    }
}
