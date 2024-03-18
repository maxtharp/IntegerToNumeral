package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidityTests {
    private final IntegerToNumeral converter = new IntegerToNumeral();

    @Test
    public void Valid0Test(){
        Assertions.assertFalse(converter.validInt(0));
    }

    @Test
    public void Valid1Test(){
        Assertions.assertTrue(converter.validInt(1));
    }
}
