package model;

import java.util.Scanner;

public class IntegerToNumeral {
    private final Scanner sc = new Scanner(System.in);

    public boolean validInt(int input) {
        return (input >= 1 && input <= 3000);
    }

    public static String converter(int num) {
        String[] singleDigit = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return singleDigit[num % 10];
    }
}
