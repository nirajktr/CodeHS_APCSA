public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver
    
    // Constructor
    public Racecar(String driverName, double acceleration) {
        name = driverName;
        accel = acceleration;
    }
    
    // Returns the time it takes the racecar
    // to complete the track rounded to 2 decimals
    public double computeTime(double distance)
    {
        double time = Math.sqrt((2 * distance) / accel);
        return Math.round(time * 100) / 100.0;
    }
    
    public String toString()
    {
        return "Racer " + name;
    }
}
