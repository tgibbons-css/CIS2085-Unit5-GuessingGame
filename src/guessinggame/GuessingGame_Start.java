package guessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *  Starting example of the Guessing Game with no loop
 *    --- Try adding either a While or Do-while loop 
 */
public class GuessingGame_Start {
    public static void main(String[] args)
    {
        // Welcome user.
        System.out.println("============ Starting example with no loop ============");
        System.out.println("Welcome!  The object of this game is to guess the number I am thinking of between 1 and 100.");
        System.out.println();
        Scanner input = new Scanner(System.in);
        
        int secretNumber;
        // Generate secret number with either Math.random() or Random.nextInt()
        secretNumber = (int) (Math.random() * 100) + 1;     // Generate numbers between 1 and 100 using Math.random()
        // 100 - the number of numbers we need in our range.
        // 1 - shifts the range of numbers up or down the number line.
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;             // Generate numbers between 1 and 100 using Random.nextInt()
        
        // Get user's guess.
        System.out.print("What is your guess? ");
        int usersGuess = input.nextInt();
        
        // Display hint.
        if (usersGuess > secretNumber)
        {
            System.out.println("Too high!");
        }
        else if (usersGuess < secretNumber)
        {
            System.out.println("Too low!");
        } else {
            // User guess it.  Congratulate them.
           System.out.println();
           System.out.println("You got it!  The secret number was " + secretNumber + ".");           
        }
        
    }
}
