package com.kodilla.exception;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfRounds() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number of rounds: ");
            String input = sc.nextLine();
            try {
                int rounds = Integer.parseInt(input);
                return rounds;
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
