import java.util.ArrayList;

public class SystemManager {
    ArrayList<Location> locations = new ArrayList<Location>();
    ArrayList<Leg> legs = new ArrayList<Leg>();

    public SystemManager() {

    }

    public void addLocation(Location l) {
        locations.add(l);
    }

    // Postconditions: adds given leg to legs
    public void addLeg(Leg l) {
        legs.add(l);
        l.getOrigin().addConnection(l);
    }

    // Postconditions: returns locations with given name
    public Location findLocation(String name) {
        for (int i = 0; i < locations.size(); i++) {
            if (locations.get(i).getName().equals(name)) {
                return locations.get(i);
            }
        }
        return null;
    }

    // Pre-Condition: origin and destination are pre-existing locations
    // Post-Condition: returns the cheapest route from origin to destination
    public Route findCheapestRoute(Location origin, Location destination, String day) {
        Route routes = new Route();
        return origin.bestRouteTo(destination, day, routes, 1);
    }

    // Pre-Condition: origin and destination are pre-existing locations
    // Post-Condition: returns the route from origin to destination that require the
    // least amount of legs
    public Route findMinStepsRoute(Location origin, Location destination, String day) {
        Route routes = new Route();
        return origin.bestRouteTo(destination, day, routes, 2);
    }

    // Pre-Condition: origin and destination are pre-existing locations
    // Post-Condition: returns the shortest route from origin to destination in
    // terms of distance
    public Route findShortestKmRoute(Location origin, Location destination, String day) {
        Route routes = new Route();
        return origin.bestRouteTo(destination, day, routes, 3);
    }

    // Postconditions: prints all legs and their available days
    // and all the locations
    public void printSystemDetails() {
        String output = "";
        output += "Legs:\n";
        for (Leg l : legs) {
            output += l + ", Available on: " + l.getDaysAvailable() + "\n";
        }
        output += "\nLocations:\n";
        for (Location loc : locations) {
            output += loc + "\n";
        }
    }

}
