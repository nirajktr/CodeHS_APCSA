import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What do you want to drink? ");
        String drink = input.nextLine();
        
        System.out.print("Do you want sugar with that (true or false)? ");
        boolean wantsSugar = input.nextBoolean();
        
        System.out.println("\nConfirming your order. You wanted: ");
        if (wantsSugar) {
            System.out.println(drink + " with sugar");
        } else {
            System.out.println(drink);
        }
    }
}
