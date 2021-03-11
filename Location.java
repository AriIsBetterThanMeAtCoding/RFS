import java.util.*;

public abstract class Location {
    private String name;
    private ArrayList<Leg> connectingLegs = new ArrayList<Leg>();

    public Location() {
        name = "unspecified";
    } // location

    public Location(String n) {
        name = n;
    } // location

    // adds a leg connecting to location
    public void addConnection(Leg l) {
        connectingLegs.add(l);
    } // addConnection

    // Pre-Condition: loc is a created location, day is one day of the weekend,
    // 1 <= func <= 3
    // Post-Condition: finds all the routes from a location to loc. func will
    // determine what to find after
    public Route bestRouteTo(Location loc, String day, Route current, int func) {
        ArrayList<Route> possRoutes = new ArrayList<Route>();

        // base cases
        if (this.equals(loc))
            return current; // arrived at destination
        if (connectingLegs.size() == 0)
            return null; // arrived at dead end

        // go through each connecting leg
        for (int i = 0; i < connectingLegs.size(); i++) {
            if (connectingLegs.get(i).getDaysAvailable().contains(day)) {

                Route temp = (Route) current.clone();
                Leg currentLeg = connectingLegs.get(i);

                if (!current.legInRoute(currentLeg)) { // if haven't been here before
                    temp.addLeg(currentLeg);
                    Route newRoute = currentLeg.getDestination().bestRouteTo(loc, day, temp, func);

                    if (newRoute != null)
                        possRoutes.add(newRoute);
                } // if

            } // if
        } // for
        
        // decide optimal route based on parameter func given
        switch (func) {
        case 1:
            return cheapestRouteTo(possRoutes);
        case 2:
            return minStepsRouteTo(possRoutes);
        case 3:
            return shortestKmRouteTo(possRoutes);
        default:
            return null;

        } // switch
    } // bestRouteTo

    // Pre-Condition: possRoutes is an ArrayList of all the possible routes from one
    // place to another
    // Post-Condition: finds the route that cost the least in the ArrayList
    public Route cheapestRouteTo(ArrayList<Route> possRoutes) {
        double minCost = Double.MAX_VALUE;
        int minIndex = -1;

        // find cheapest possible route
        for (int i = 0; i < possRoutes.size(); i++) {
            double thisCost = possRoutes.get(i).totalCost();

            if (thisCost < minCost) {
                minCost = thisCost;
                minIndex = i;
            } // if
        } // for
        
        if(minIndex == -1) return null;
        return possRoutes.get(minIndex);
    } // cheapestRouteTo

    // Pre-Condition: possRoutes is an ArrayList of all the possible routes from one
    // place to another
    // Post-Condition: finds the route contains the least amount of steps in the
    // ArrayList
    public Route minStepsRouteTo(ArrayList<Route> possRoutes) {
        double minSteps = Double.MAX_VALUE;
        int minIndex = -1;

        // find route w least steps
        for (int i = 0; i < possRoutes.size(); i++) {
            double thisSteps = possRoutes.get(i).totalSteps();

            if (thisSteps < minSteps) {
                minSteps = thisSteps;
                minIndex = i;
            } // if
        } // for
        
        if(minIndex == -1) return null;
        return possRoutes.get(minIndex);
    } // minStepsRouteTo
    
    // Pre-Condition: possRoutes is an ArrayList of all the possible routes from one
    // place to another
    // Post-Condition: finds the shortest route in the ArrayList
    public Route shortestKmRouteTo(ArrayList<Route> possRoutes) {
        double minDist = Double.MAX_VALUE;
        int minIndex = -1;

        // find shortest possible route
        for (int i = 0; i < possRoutes.size(); i++) {
            double thisDist = possRoutes.get(i).totalDistance();

            if (thisDist < minDist) {
                minDist = thisDist;
                minIndex = i;
            } // if
        } // for

        if(minIndex == -1) return null;
        return possRoutes.get(minIndex);
    } // shortestKmRouteTo
    
    /*
     * Postconditions: returns this location's name
     */
    public String getName() {
        return name;
    } // getName

    public String toString() {
        return name;
    } // toString

    // Post-Condition: determines whether this location has
    // the same name as another
    public boolean equals(Location loc) {
        if (name.equals(loc.name))
            return true;
        return false;
    } // equals
} // Location
