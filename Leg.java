
public abstract class Leg {
    private Location origin;
    private Location destination;
    private String daysAvailable = "";
    private int distance =0;
    private double costPerKm = 0;
    
    public Leg (Location origin, Location destination, int distanceInKm, String days, double cost) {
        
        // check for a valid distance
        if(distanceInKm < 1) {
            System.out.println("Leg has negative length");
            System.exit(0);
        }
        
        // check for valid days
        for(int i = 0; i < days.length(); i++) {
            if(!"MTWRFSU".contains(days.charAt(i) + "")) {
                System.out.println("Invalid days. Valid days are MTWRFSU");
                System.exit(0);
            } // if
        } // for
        
        
        this.origin = origin;
        this.destination = destination;
        distance = distanceInKm;
        daysAvailable = days;
        costPerKm = cost;
    } // Leg
    
    
    /*
     * Postconditions: returns the Origin Location
     */
    public Location getOrigin() {
        return origin;
    } // getOrigin
    
    /*
     * Postconditions: returns the Destination Location
     */
    public Location getDestination() {
        return destination;
    } // getDestination
    
    /*
     * Postconditions: returns the Days Available
     */
    public String getDaysAvailable() {
        return daysAvailable;
    } // getDaysAvailable
    
    /*
     * Postconditions: returns the Distance
     */
    public int getDistance() {
        return distance;
    } // getDistance
    
    /*
     * Postconditions: returns the getCostPerKm
     */
    public double getCostPerKm() {
        return costPerKm;
    } // getCostPerKm
    
    /*
     * Postconditions: returns the toString
     */
    public String toString() {
        return "Origin: " + origin + " Destination: " + destination;
    } // toString
} // Leg
