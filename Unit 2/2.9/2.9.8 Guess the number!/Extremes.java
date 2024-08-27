public class Extremes
{
    private int min;
    private int max;
    
    // Constructor
    public Extremes()
    {
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
    }
    
    // Returns the difference between the user's guess and the max value
    public int maxDiff(int guess)
    {
        return Math.abs(max - guess);
    }

    // Returns the difference between the user's guess and the min value
    public int minDiff(int guess)
    {
        return Math.abs(min - guess);
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}
