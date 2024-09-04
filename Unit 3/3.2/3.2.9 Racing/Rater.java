public class Rater
{
    private String name;
    private int rating;

    public Rater(String name, int rating)
    {
        this.name = name;
        this.rating = rating;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int newRating)
    {
        if (newRating <= 5)
        {
            rating = newRating;
        }
    }

    public String toString()
    {
        if (rating < 50)
        {
            return "Not Recommended Company " + name;
        }
        else if (rating > 85)
        {
            return "Gold Star Company " + name;
        }
        else
        {
            return "Well Rated Company " + name;
        }
    }
}
