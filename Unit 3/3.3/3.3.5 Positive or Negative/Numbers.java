import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        
        if (number >= 0) {
            
            System.out.println("The number is positive!");
        } else {
            System.out.println("The number is negative!");
        }

        // Close the scanner
        scanner.close();
    }
}
