import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input player names
        System.out.print("Enter player one's name: ");
        String playerOne = scanner.nextLine(); 
        
        System.out.print("Enter player two's name: ");
        String playerTwo = scanner.nextLine();

        // Input player scores
        System.out.print("Enter " + playerOne + "'s score: ");
        int scoreOne = scanner.nextInt();

        System.out.print("Enter " + playerTwo + "'s score: ");
        int scoreTwo = scanner.nextInt();

        // Determine alphabetical order using compareTo
        if (playerOne.compareTo(playerTwo) < 0) {
            System.out.println(playerOne + " scored " + scoreOne + " points");
            System.out.println(playerTwo + " scored " + scoreTwo + " points");
        } else {
            System.out.println(playerTwo + " scored " + scoreTwo + " points");
            System.out.println(playerOne + " scored " + scoreOne + " points");
        }

        // Determine which player scored more
        if (scoreOne > scoreTwo) {
            System.out.println(playerOne + " wins!");
        } else if (scoreTwo > scoreOne) {
            System.out.println(playerTwo + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
