public class IsEven {
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    // Main method to test the isEven method
    public static void main(String[] args) {
        // Test cases
        System.out.println("4 is even: " + isEven(4)); // true
        System.out.println("7 is even: " + isEven(7)); // false
        System.out.println("0 is even: " + isEven(0)); // true
        System.out.println("-2 is even: " + isEven(-2)); // true
        System.out.println("-3 is even: " + isEven(-3)); // false
    }
}