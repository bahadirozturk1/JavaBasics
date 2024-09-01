package numberguesser;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {

        //initialize scanner and random
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("enter a number to pick from: ");
        int userNum = sc.nextInt();

        //generate a random number
        int numberToGuess = rand.nextInt(userNum) + 1;

        //initialize variables
        int userGuess = 0;
        int numberOfTries = 0;

        //game loop
        while (userGuess != numberToGuess) {
            System.out.println("Enter your guess 1-" + userNum);
            userGuess = sc.nextInt();
            numberOfTries++;

            if (userGuess > numberToGuess) {
                System.out.println("lower");
            } else if (userGuess < numberToGuess) {
                System.out.println("higher");
            } else {
                System.out.println("Correct! you've guessed in " + numberOfTries + " tries");
            }
        }
    }
}
