
public abstract class Leg {
    Location origin;
    Location destination;
    String daysAvailable = "";
    int distance =0;
    double costPerKm = 0;
    
    public Leg (Location origin, Location destination, int distanceInKm, String days) {
        this.origin = origin;
        this.destination = destination;
        distance = distanceInKm;
        daysAvailable = days;
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
    
}
