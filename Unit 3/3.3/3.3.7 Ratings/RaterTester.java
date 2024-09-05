public class RaterTesting
{
    public static void main(String[] args)
    {
        // Create a Rater object with an initial rating less than 80
        Rater rater = new Rater("Tina's Tires", 75);

        // Update the review and print the object
        rater.updateReview();
        System.out.println(rater);

        // Set the rating to a value between 80 and 100
        rater.setRating(85);

        // Update the review and print the object again
        rater.updateReview();
        System.out.println(rater);
    }
}