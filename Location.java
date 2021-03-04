import java.util.*;
    
public abstract class Location {
    private String name;
    private ArrayList<Leg> connectingLegs = new ArrayList<Leg>();
    
    public Location() {
        name = "unspecified";
    }
    
    public Location(String n) {
        name = n;
    }
    
    public void addConnection (Leg l) {
        connectingLegs.add(l);
    }
    
    public Route cheapestRouteTo(Location loc, String day) {
        return null;
    }
    
    public Route minStepsRouteTo(Location loc, String day) {
        return null;
    }
    
    public Route shortestKmRouteTo(Location loc, String day) {
        return null;
    }
} // Location
