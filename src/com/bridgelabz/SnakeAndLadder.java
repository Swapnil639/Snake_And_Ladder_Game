package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPosition = 0;
        System.out.println("Player at start position " + playerPosition);

        int randomDice = (int) (Math.floor(Math.random()*10)%6+1);
        System.out.println("Player rolls the die to get number is "+randomDice);
    }
}
