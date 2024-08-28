/* This is the Scratchpad!
This file is not graded, but you can use it to test your code.

You can write and test your method in the Scratchpad, but make
sure to copy and paste it into the Unit Test file before checking
your answer. Remember to only copy and paste the method you want
to submit, not all of your tests.
*/

public class Scratchpad
{
    public static void main(String[] args)
    {
        // Add your own tests here
        System.out.println(celsiusToFahrenheit(0)); // Expected output: 32.0
        System.out.println(celsiusToFahrenheit(100)); // Expected output: 212.0
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double degrees) {
        return (9.0 / 5.0 * degrees) + 32;
    }
}