public class MicrowaveCooking
{
    public static void main(String[] args)
    {
        // Generate a random number of seconds between 0 and 60
        Random rand = new Random();
        int seconds = rand.nextInt(61); // 0 to 60 inclusive

        // Print the number of seconds
        System.out.println("Microwaving for " + seconds + " seconds");

        // Use if-else statements to print whether the roll is fine or will catch fire
        if (seconds <= 20) {
            System.out.println("Perfect cooking time!");
        } else {
            System.out.println("Your roll will catch fire!");
        }
    }
}
