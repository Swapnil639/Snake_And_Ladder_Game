package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        int count=0;
        int player1Position = 0;
        int player2Position = 0;
        System.out.println("Player1 at start position " + player1Position);
        System.out.println("Player2 at start position " + player2Position);

        int rollDice = (int) (Math.floor(Math.random() * 10) % 6 + 1);

        while (player1Position < 100 && player2Position < 100) {
            count++;
            System.out.println("Player roll the die to get number is " + rollDice);

            Random random = new Random();
            int option = random.nextInt(3);
            System.out.println("Check option " + option);

            switch (option) {
                case 0:
                    System.out.println("No play");
                    player1Position += 0;
                    player2Position += 0;
                    System.out.println("No Play - You stay in the same position");
                    break;
                case 1:
                    int option1 = random.nextInt(2);
                    if (option1 == 0) {
                        player1Position += rollDice;
                        if (player1Position > 100) {
                            player1Position = 100;
                        }
                    } else {
                        player2Position += rollDice;
                        if (player2Position > 100) {
                            player2Position = 100;
                        }
                    }
                    System.out.println("Player1 position is now : " + player1Position);
                    System.out.println("Player2 position is now : " + player2Position);
                    break;
                case 2:
                    int option2 = random.nextInt(2);
                    if (option2 == 0) {
                        player1Position -= rollDice;
                        if (player1Position < 0) {
                            player1Position = 0;
                        }
                    } else {
                        player2Position -= rollDice;
                        if (player2Position < 0) {
                            player2Position = 0;
                        }
                    }
                    System.out.println("Player1 position is now : " + player1Position);
                    System.out.println("Player2 position is now : " + player2Position);
                    break;
            }
        }
        if (player1Position > player2Position) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Congratulations, Player1 won the game!!!");
            System.out.println("------------------------------------------------------------------");
        } else {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Congratulations, Player2 won the game!!!");
            System.out.println("------------------------------------------------------------------");
        }
        System.out.println("Count number of time dice was played to win the game is : "+count);

    }
}
