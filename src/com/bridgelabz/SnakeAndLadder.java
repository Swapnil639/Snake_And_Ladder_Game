package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPosition = 0;
        System.out.println("Player at start position " + playerPosition);

        int rollDice = (int) (Math.floor(Math.random() * 10) % 6 + 1);

        while (playerPosition != 100) {
            System.out.println("Player roll the die to get number is " + rollDice);

            Random random = new Random();
            int option = random.nextInt(3);
            System.out.println("Check option " + option);

            switch (option) {
                case 0:
                    System.out.println("No play");
                    playerPosition += 0;
                    System.out.println("No Play - You stay in the same position");
                    break;
                case 1:
                    playerPosition += rollDice;
                    if (playerPosition > 100) {
                        playerPosition += 0;
                    }
                    System.out.println("You got a ladder. Your position is now : " + playerPosition);
                    break;
                case 2:
                    playerPosition -= rollDice;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    }
                    System.out.println("You got a snake. Your position is now : " + playerPosition);
                    break;
            }
        }

    }
}
