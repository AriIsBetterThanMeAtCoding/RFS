import java.util.ArrayList;

public abstract class SystemManager {
    ArrayList<Location> locations = new ArrayList<Location>();
    ArrayList<Leg> legs = new ArrayList<Leg>();
    
<<<<<<< HEAD
    // Postconditions: adds given location to locations
=======
    public SystemManager() {
        
    }
    
>>>>>>> branch 'main' of https://github.com/AriIsBetterThanMeAtCoding/RFS
    public void addLocation(Location l) {
        locations.add(l);
    }
    
    // Postconditions: adds given leg to legs
    public void addLeg(Leg l) {
        legs.add(l);
    }
    
    // Postconditions: returns locations with given name
    public Location findLocation(String name) {
        for(int i = 0; i<locations.size(); i++) {
            if(locations.get(i).getName().equals(name)) {
                return locations.get(i);
            }
        }
        return null;
    }
    
    public abstract Route findCheapestRoute (Location origin, Location destination, String day);
    public abstract Route findMinStepsRoute (Location origin, Location destination, String day);
    public abstract Route findShortestKmRoute (Location origin, Location destination, String day);
    
    // Postconditions: prints all legs and their available days
    // and all the locations
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
