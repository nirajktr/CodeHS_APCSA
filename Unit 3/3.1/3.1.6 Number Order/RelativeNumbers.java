import java.util.Scanner;

public class RelativeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		boolean isLessThan = num1 < num2;
		boolean isEqualTo = num1 == num2;
		boolean isGreaterThan = num1 > num2;

		System.out.println(num1 + " < " + num2 + ": " + isLessThan);
		System.out.println(num1 + " == " + num2 + ": " + isEqualTo);
		System.out.println(num1 + " > " + num2 + ": " + isGreaterThan);
	}
}