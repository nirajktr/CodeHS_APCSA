import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        Scanner scanner = new Scanner(System.in);
        // Prompt for player one's name and score
        System.out.print("Enter player one's name: ");
        String playerOne = scanner.nextLine();
        System.out.print("Enter " + playerOne + "'s score: ");
        int scoreOne = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Prompt for player two's name and score
        System.out.print("Enter player two's name: ");
        String playerTwo = scanner.nextLine();
        System.out.print("Enter " + playerTwo + "'s score: ");
        int scoreTwo = scanner.nextInt();

        // Print scores in alphabetical order
        if (playerOne.compareTo(playerTwo) < 0) {
            System.out.println(playerOne + " scored " + scoreOne + " points");
            System.out.println(playerTwo + " scored " + scoreTwo + " points");
        } else {
            System.out.println(playerTwo + " scored " + scoreTwo + " points");
            System.out.println(playerOne + " scored " + scoreOne + " points");
        }

        if (scoreOne > scoreTwo) {
            System.out.println(playerOne + " wins!");
        } else if (scoreTwo > scoreOne) {
            System.out.println(playerTwo + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
