
public class Location {
    
public class abstract Location {
    String name;
    ArrayList<Leg> connectingLegs = new ArrayList<Leg>();
    
    public Location (String n) {
        name = n;
    }
    
    public addConnection (Leg l) {
        connectingLegs.add(l);
    }
    
    public cheapestRouteTo(Location loc, String day) {
        
    }
    
    public minStepsRouteTo(Location loc, String day) {
        
    }
    
    public shortestKmRouteTo(Location loc, String day) {
        
    }
} // Location
