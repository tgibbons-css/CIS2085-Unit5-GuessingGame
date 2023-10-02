package guessinggame;

import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args)
    {
        // Welcome user.
        System.out.println("Welcome!  The object of this game is to guess the number I am thinking of between 1 and 100.");
        System.out.println();
        Scanner input = new Scanner(System.in);
        
        // Generate secret number.
        //int secretNumber = (int) (Math.random() * 100) + 1;
        // 100 - the number of numbers we need in our range.
        // 1 - shifts the range of numbers up or down the number line.
        int secretNumber = (int) (Math.random() * 101) + 100; // Generate numbers between 100 and 200.
        
        // Get user's guess.
        System.out.print("What is your guess? ");
        int usersGuess = input.nextInt();
        
        while (usersGuess != secretNumber)
        {
            // Display hint.
            if (usersGuess > secretNumber)
            {
                System.out.println("Too high!");
            }
            else
            {
                System.out.println("Too low!");
            }
            
            // Get user's guess.
            System.out.print("What is your guess? ");
            usersGuess = input.nextInt();
        }
        
        // User guess it.  Congratulate them.
        System.out.println();
        System.out.println("You got it!  The secret number was " + secretNumber + ".");
    }
}
