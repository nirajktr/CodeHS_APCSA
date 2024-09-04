public class RaterTester
{
    private String name; // name of company
    private int rating; // number rating (1 - 100)
    
    
    public Rater(String company, int initialRating)
    {
        name = company;
        rating = initialRating;
    }
    
    // Set rating to newRating
    // As long as it's no more than 5
    public void setRating(int newRating)
    {
        if (newRating <= 5) {
            rating = newRating;
        }
    }
    
    // Returns the rating of the company
    public int getRating()
    {
        return rating;
    }
    
    // Returns a string representation of the company
    // based on their ratings
    public String toString()
    {
        if (rating < 50) {
            return "Not Recommended Company " + name;
        } else if (rating > 85) {
            return "Gold Star Company " + name;
        } else {
            return "Well Rated Company " + name;
        }
    }
}
