import java.util.Scanner;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Create an Extremes object
        Extremes extremes = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        System.out.print("Guess the maximum Integer value: ");
        int maxGuess = scanner.nextInt();
        
        // Compute and display the difference between the max and the guess
        int maxDifference = extremes.maxDiff(maxGuess);
        System.out.println("You were off by " + maxDifference);
        
        // Ask the user to guess the minimum value of an Integer
        System.out.print("Guess the minimum Integer value: ");
        int minGuess = scanner.nextInt();
        
        // Compute and display the difference between the min and the guess
        int minDifference = extremes.minDiff(minGuess);
        System.out.println("You were off by " + minDifference);
        
        // Close the scanner
        scanner.close();
    }
}
