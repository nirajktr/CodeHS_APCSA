public class Rater
{
    private String name; // name of company
    private int rating; // number rating (1 - 100)
    private String review; // review shown with company name 
    
    
    public Rater(String company, int initialRating)
    {
        name = company;
        rating = initialRating;
        review = "";
        
    }
    
    // Set rating to newRating
    // As long as it's no more than 100
    public void setRating(int newRating)
    {
        if (newRating <= 100) {
            rating = newRating;
        }
    }
    
    // Updates review line based on rating
    public void updateReview()
    {
        if (rating >= 80) {
            review = "Proudly recommended";
        } else {
            review = "Needs more ratings";
        }
    }
    
    
    // Returns the rating of the company
    public int getRating()
    {
        return rating;
    }
    
    // Returns a string representation of the company
    // Uses the form
    // name: review
    public String toString()
    {
        return name + " : " + review;
    }
}