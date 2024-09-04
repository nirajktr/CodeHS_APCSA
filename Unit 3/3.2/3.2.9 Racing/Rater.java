public class RaterTester
{
    public static void main(String[] args)
    {
        Rater jrs = new Rater("Jr Cookery", 75);
        
        
        // Test Case: In the middle
        System.out.println("Current Rating: " + jrs.getRating());
        System.out.println(jrs);
        
        
        // Test Case: High rating
        jrs.setRating(90);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);
        
        // Test Case: Setting rating too high
        jrs.setRating(200);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);
        
        
        // Test Case: Low rating
        jrs.setRating(40);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);
        
    }
}
