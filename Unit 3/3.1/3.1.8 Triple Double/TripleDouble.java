import java.util.Scanner; 

public class TripleDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many points did you score? ");
        int points = scanner.nextInt();
        
        System.out.print("How many rebounds did you get? ");
        int rebounds = scanner.nextInt();
        
        System.out.print("How many assists did you have? ");
        int assists = scanner.nextInt();
        
        boolean has10Points = points >= 10;
        boolean has10Rebounds = rebounds >= 10;
        boolean has10Assists = assists >= 10;
        
        System.out.println("You got 10 or more points: " + has10Points);
        System.out.println("You got 10 or more rebounds: " + has10Rebounds);
        System.out.println("You got 10 or more assists: " + has10Assists);
    }
    
}
