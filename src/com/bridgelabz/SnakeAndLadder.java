package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPosition = 0;
        System.out.println("Player at start position " + playerPosition);

        int rollDice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println("Player roll the die to get number is " + rollDice);

        while (playerPosition != 100) {
            Random random = new Random();
            int option = random.nextInt(3);
            System.out.println("Check option " + option);

            switch (option) {
                case 0:
                    System.out.println("No play");
                    playerPosition += 0;
                    System.out.println("Player current position " + playerPosition);
                    break;
                case 1:
                    playerPosition += rollDice;
                    System.out.println("Player current position " + playerPosition);
                    break;
                case 2:
                    playerPosition -= rollDice;
                    System.out.println("Player current Position " + playerPosition);
                    break;
            }
        }

    }
}
