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
    
    // adds a leg connecting to location
    public void addConnection (Leg l) {
        connectingLegs.add(l);
    } // addConnection
    
    public Route bestRouteTo(Location loc, String day, Route current, int func) {
        ArrayList<Route> possRoutes = new ArrayList<Route>();
        
        // base cases
        if(this.equals(loc)) return current; // arrived at destination
        if(connectingLegs.size() == 0) return null; // arrived at dead end
        
        // go through each connecting leg
        for(int i = 0; i < connectingLegs.size(); i++) {
            if(connectingLegs.get(i).getDaysAvailable().contains(day)) {
                
                Route temp = (Route)current.clone();
                Leg currentLeg = connectingLegs.get(i);
                
                if(!current.legInRoute(currentLeg)) { // if haven't been here before
                    temp.addLeg(currentLeg);
                    Route newRoute = currentLeg.getDestination().bestRouteTo(loc, day, temp, func);
                    
                    if(newRoute != null) possRoutes.add(newRoute);
                } // if
                
            } // if
        } // for
        
        switch(func) {
            case 1: return cheapestRouteTo(possRoutes);
            case 2: return minStepsRouteTo(possRoutes);
            case 3: return shortestKmRouteTo(possRoutes);
            default: return null;
            
        } // switch
    } // bestRouteTo
    
    public Route cheapestRouteTo(ArrayList<Route> possRoutes) {
        double minCost = Double.MAX_VALUE;
        int minIndex = -1;

        // find cheapest possible route
        for(int i = 0; i < possRoutes.size(); i++) {
            double thisCost = possRoutes.get(i).totalCost();
            
            if (thisCost < minCost) {
                minCost = thisCost;
                minIndex = i;
            } // if
        } // for
        
        return possRoutes.get(minIndex);
    } // cheapestRouteTo
    
    public Route minStepsRouteTo(ArrayList<Route> possRoutes) {
        double minSteps = Double.MAX_VALUE;
        int minIndex = -1;

        // find cheapest possible route
        for(int i = 0; i < possRoutes.size(); i++) {
            double thisSteps = possRoutes.get(i).totalSteps();
            
            if (thisSteps < minSteps) {
                minSteps = thisSteps;
                minIndex = i;
            } // if
        } // for
        
        return possRoutes.get(minIndex);
    } // minStepsRouteTo
    
    public Route shortestKmRouteTo(ArrayList<Route> possRoutes) {
        double minDist = Double.MAX_VALUE;
        int minIndex = -1;

        // find cheapest possible route
        for(int i = 0; i < possRoutes.size(); i++) {
            double thisDist = possRoutes.get(i).totalDistance();
            
            if (thisDist < minDist) {
                minDist = thisDist;
                minIndex = i;
            } // if
        } // for
        
        return possRoutes.get(minIndex);
    } // shortestKmRouteTo
    
    public String getName() {
        return name;
    } // getName
    
    public String toString() {
        return name;
    } // toString
    
    public boolean equals(Location loc) {
        if(name.equals(loc.name)) return true;
        return false;
    } // equals
} // Location
