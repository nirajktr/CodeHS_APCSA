import java.util.Scanner;

public class AddedSugar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many grams of sugar have you eaten today? ");
		int gramsOfSugar = scanner.nextInt();
		
		boolean canEatMoreSugar = gramsOfSugar < 30;
		System.out.println("You can eat more sugar: " + canEatMoreSugar);
	}
}