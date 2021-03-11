import java.util.ArrayList;

public class SystemManager {
    ArrayList<Location> locations = new ArrayList<Location>();
    ArrayList<Leg> legs = new ArrayList<Leg>();

    public SystemManager() {

    } // SystemManager

    public void addLocation(Location l) {
        for (int i = 0; i < locations.size(); i++) {
            if (locations.get(i).getName().equals(l.getName())) {
                System.out.println("This Location Already Exists");
                System.exit(0);
            } // if
        } // for
        locations.add(l);

    } // addLocation

    /*
     * Postconditions: adds given leg to legs
     * and adds connection to the leg's origin
     */
    public void addLeg(Leg l) {
        legs.add(l);
        l.getOrigin().addConnection(l);
    } // addLeg

    /*
     * Postconditions: returns locations with given name
     */
    public Location findLocation(String name) {
        for (int i = 0; i < locations.size(); i++) {
            if (locations.get(i).getName().equals(name)) {
                return locations.get(i);
            } // if
        } // for
        return null;
    } // findLocation

    /*
     * Pre-Condition: origin and destination are pre-existing locations
     * Post-Condition: returns the cheapest route from origin to destination
     */
    public Route findCheapestRoute(Location origin, Location destination, String day) {
        Route routes = new Route();
        return origin.bestRouteTo(destination, day, routes, 1);
    } // findChepeastRoute

    /*
     * Pre-Condition: origin and destination are pre-existing locations
     * Post-Condition: returns the route from origin to destination that require the
     * least amount of legs
     */
    public Route findMinStepsRoute(Location origin, Location destination, String day) {
        Route routes = new Route();
        return origin.bestRouteTo(destination, day, routes, 2);
    } // findMinStepRoute

    /*
     * Pre-Condition: origin and destination are pre-existing locations
     * Post-Condition: returns the shortest route from origin to destination in
     * terms of distance
     */
    public Route findShortestKmRoute(Location origin, Location destination, String day) {
        Route routes = new Route();
        return origin.bestRouteTo(destination, day, routes, 3);
    } // findShortestKmRoute

    /*
     * Postconditions: prints all legs and their available days
     * and all the locations
     */
    public void printSystemDetails() {
        String output = "";
        output += "Legs:\n";
        for (Leg l : legs) {
            output += l + ", Available on: " + l.getDaysAvailable() + "\n";
        } // for
        output += "\nLocations:\n";
        for (Location loc : locations) {
            output += loc + "\n";
        } // for
    } // printSystemDetails

} // SystemManager
