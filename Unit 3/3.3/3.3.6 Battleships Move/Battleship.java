public class Battleship
{
    private String shipType;
    private int position;
    
    public Battleship(String type, int shipPosition)
    {
        shipType = type;
        position = shipPosition;
    }
    
    // Moves the ship
    // If safeToMove is true, add 5 to position
    // else subtract 5 from position
    public void move(boolean safeToMove) {
        if (safeToMove) {
            position += 5;
        } else {
            position -= 5;
        }
    }
    
    // Returns the position of the ship
    public int getPosition()
    {
        return position;
    }
    
    // String representation of the object
    public String toString()
    {
        return shipType + " at " + position;
    }
}
