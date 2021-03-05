import java.util.ArrayList;

public abstract class SystemManager {
    ArrayList<Location> locations = new ArrayList<Location>();
    ArrayList<Leg> legs = new ArrayList<Leg>();
    
    public void addLocation(Location l) {
        locations.add(l);
    }
    public void addLeg(Leg l) {
        legs.add(l);
    }
    public Location findLocation(String name) {
        for(int i = 0; i<locations.size(); i++) {
            if(locations.get(i).getName().equals(name)) {
                return locations.get(i);
            }
        }
        return null;
    }
    public void findCheapestRoute (Location origin, Location destination, String day) {
        
    }
    public void findMinStepsRoute (Location origin, Location destination, String day) {
        for() {
            
        }
    }
    public void findShortestKmRoute (Location origin, Location destination, String day) {
        
    }
    public void printSystemDetails() {
        // TODO Auto-generated method stub
        
    }
    
    public void printSystemDetails() {
        String output = "";
        output += "Legs:\n";
        for(Leg l: legs) {
            output += l + ", Available on: " + l.getDaysAvailable() + "\n";
        }
        output += "\nLocations:\n";
        for(Location loc: locations) {
            output += loc + "\n";
        }
    }
    
}
