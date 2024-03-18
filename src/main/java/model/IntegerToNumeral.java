package model;

import java.util.Scanner;

public class IntegerToNumeral {
    private final Scanner sc = new Scanner(System.in);

    public boolean validInt(int input) {
        return (input >= 1 && input <= 3000);
    }
}
