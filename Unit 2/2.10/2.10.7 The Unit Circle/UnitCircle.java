public class UnitCircle 
{
    public static void main(String[] args)
    {
        // Print the header
        System.out.println("Radians: (cos, sin)");
        
        // Define the angles
        double angle1 = 0.0;
        double angle2 = Math.PI / 2;
        double angle3 = Math.PI;
        
        // Calculate and print for angle1
        double cos1 = Math.cos(angle1);
        double sin1 = Math.sin(angle1);
        cos1 = Math.round(cos1 * 100) / 100.0;
        sin1 = Math.round(sin1 * 100) / 100.0;
        System.out.println(angle1 + ": " + cos1 + ", " + sin1);
        
        // Calculate and print for angle2
        double cos2 = Math.cos(angle2);
        double sin2 = Math.sin(angle2);
        cos2 = Math.round(cos2 * 100) / 100.0;
        sin2 = Math.round(sin2 * 100) / 100.0;
        System.out.println(angle2 + ": " + cos2 + ", " + sin2);
        
        // Calculate and print for angle3
        double cos3 = Math.cos(angle3);
        double sin3 = Math.sin(angle3);
        cos3 = Math.round(cos3 * 100) / 100.0;
        sin3 = Math.round(sin3 * 100) / 100.0;
        System.out.println(angle3 + ": " + cos3 + ", " + sin3);
    }
}
