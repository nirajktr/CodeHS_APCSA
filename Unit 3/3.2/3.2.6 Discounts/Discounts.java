import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in); 
        // Ask how many hours were you parked
        System.out.print("How many hours were you parked? ");    
        // Compute cost - $3.50 per hour
        double cost = 3.50 * in.nextDouble();    
        // If cost is over $20, set cost to $20
        if (cost > 20) {
            cost = 20;
        }    
        // Display the final cost
        System.out.println("The cost is $" + cost);    
    }
}
