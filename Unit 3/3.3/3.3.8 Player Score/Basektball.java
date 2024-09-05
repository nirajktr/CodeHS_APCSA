import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the player one's name: ");
        String playerOne = scanner.nextLine(); 
        

        System.out.print("Enter the player two's name: ");
        String playerTwo = scanner.nextLine();

        System.out.print("Enter the player one's score: ");
        int scoreOne = scanner.nextInt();

        System.out.print("Enter the player two's score: ");
        int scoreTwo = scanner.nextInt();

        System.out.println(playerOne + " scored " + scoreOne + " points");
        System.out.println(playerTwo + " scored " + scoreTwo + " points");

        if (scoreOne > scoreTwo) {
            System.out.println(playerOne + " wins!");
        } else if (scoreTwo > scoreOne) {
            System.out.println(playerTwo + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
