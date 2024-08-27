import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;

        // Number of tries allowed
        int maxTries = 6;

        // Inform the player about the game
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("You have " + maxTries + " attempts to guess the number.");
        System.out.println("Good luck!");

        // Initialize variables for the guessing game
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        // Start the guessing loop
        while (numberOfTries < maxTries && !hasGuessedCorrectly) {
            int playerGuess = -1;  // Initialize playerGuess with a value that is invalid for the range

            // Prompt the user to enter a guess and handle invalid input
            while (true) {
                System.out.print("Enter your guess (1 to 100): ");
                try {
                    playerGuess = scanner.nextInt();
                    // Check if the guess is within the valid range
                    if (playerGuess < 1 || playerGuess > 100) {
                        System.out.println("Please enter a number between 1 and 100.");
                    } else {
                        break;  // Exit the loop if a valid number is entered
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next();  // Clear the invalid input
                }
            }

            numberOfTries++;

            // Check if the guess is correct
            if (playerGuess == targetNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
            } else if (playerGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // If the player did not guess the number, reveal the target number
        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);
        }

        // Close the scanner
        scanner.close();
    }
}