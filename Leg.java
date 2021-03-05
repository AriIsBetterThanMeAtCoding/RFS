
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
    }
    
    public Location getOrigin() {
        return origin;
    }
    
    public Location getDestination() {
        return destination;
    }
    
    public String getDaysAvailable() {
        return daysAvailable;
    }
    
    public int getDistance() {
        return distance;
    }
    
    public double getCostPerKm() {
        return costPerKm;
    }
    
    public String toString() {
        return "Origin: " + origin + " Destination: " + destination;
    }
}
