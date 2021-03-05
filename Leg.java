
public abstract class Leg {
    private Location origin;
    private Location destination;
    private String daysAvailable = "";
    private int distance =0;
    private double costPerKm = 0;
    
    public Leg (Location origin, Location destination, int distanceInKm, String days, double cost) {
        this.origin = origin;
        this.destination = destination;
        distance = distanceInKm;
        daysAvailable = days;
        costPerKm = cost;
    } // Leg
    
    public Location getOrigin() {
        return origin;
    } // getOrigin
    
    public Location getDestination() {
        return destination;
    } // getDestination
    
    public String getDaysAvailable() {
        return daysAvailable;
    } // getDaysAvailable
    
    public int getDistance() {
        return distance;
    } // getDistance
    
    public double getCostPerKm() {
        return costPerKm;
    } // getCostPerKm
    
    public String toString() {
        return "Origin: " + origin + " Destination: " + destination;
    } // toString
} // Leg
