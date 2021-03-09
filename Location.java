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
    
    public Route cheapestRouteTo(Location loc, String day, Route current) {

        ArrayList<Route> possRoutes = new ArrayList<Route>();

        if(connectingLegs.size() == 0) return current;
        
        for(int i = 0; i < connectingLegs.size(); i++) {
            //System.out.println("outside if: " + i);
            if(connectingLegs.get(i).getDaysAvailable().contains(day)) {
                //System.out.println("inside if: " + i);
                
                Route temp = (Route)current.clone();
                Leg currentLeg = connectingLegs.get(i);
                
                //System.out.println("orig route:\n" + current);
                //System.out.println("cloned route:\n" + temp);
                
                //System.out.println(currentLeg);
                
                if(!current.legInRoute(currentLeg)) {
                    temp.addLeg(currentLeg);
                    possRoutes.add(currentLeg.getDestination().cheapestRouteTo(loc, day, temp));
                } // if
                
            } // if
        } // for
        
        double minCost = Double.MAX_VALUE;
        int minIndex = -1;
        
        //System.out.println("size: " + possRoutes.size());
        
        for(int i = 0; i < possRoutes.size(); i++) {
            double thisCost = possRoutes.get(i).totalCost();
            
            if (thisCost < minCost) {
                minCost = thisCost;
                minIndex = i;
            }
        } // for
        
        return possRoutes.get(minIndex);
    } // cheapestRouteTo
    
    /*
    public Route minStepsRouteTo(Location loc, String day) {
        
    }
    
    public Route shortestKmRouteTo(Location loc, String day) {
        
    }
    */
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return name;
    }
} // Location
