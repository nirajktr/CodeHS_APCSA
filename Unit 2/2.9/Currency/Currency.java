public class Currency
{
    private Double value;
    
    // Constructor
    public Currency(Double startValue)
    {
        value = startValue;
    }
    
    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = newValue;
    }
    
    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        return value.intValue();
    }
    
    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public Integer getCents()
    {
        return (int) Math.round((value - value.intValue()) * 100);
    }
    
    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        return String.format("$%d.%02d", getDollars(), getCents());
    }
}
