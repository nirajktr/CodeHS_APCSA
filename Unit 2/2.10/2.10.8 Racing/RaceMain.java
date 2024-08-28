public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double acceleration1 = 1 + Math.random() * 9; // Random acceleration between 1 and 10
        double acceleration2 = 1 + Math.random() * 9; // Random acceleration between 1 and 10
        
        // Create two Racecar objects
        Racecar car1 = new Racecar("Driver1", acceleration1);
        Racecar car2 = new Racecar("Driver2", acceleration2);
        
        // Compute the finishing times for both cars
        double time1 = car1.computeTime(distance);
        double time2 = car2.computeTime(distance);
        
        // Print times of each car
        System.out.println("First car finished in " + String.valueOf(time1) + " seconds");
        System.out.println("Second car finished in " + String.valueOf(time2) + " seconds");
    }
}