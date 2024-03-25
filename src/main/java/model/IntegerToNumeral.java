package model;

import java.util.Scanner;

public class IntegerToNumeral {

    public boolean validInt(int number) {
        return (number >= 1 && number <= 3000);
    }

    public static String converter(int number) {
        StringBuilder romanNumeral = new StringBuilder();

        int[] intValues = {1000, 900, 500, 400, 100, 90, 50, 40,
                10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;

        while (number > 0) {
            if (number >= intValues[i]) {
                romanNumeral.append(numerals[i]);
                number -= intValues[i];
            } else {
                i++;
            }
        }
        return romanNumeral.toString();
    }
}
