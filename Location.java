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
        /*
        int [] temp1 = used.clone();
        int [] temp2 = used.clone();
        
        // base case
        if(n == -1) return used;
        
        // skip over this item
        temp1 = recursive(temp1, n - 1);
        
        // if possible, add this item to bag
        if(used[n] < 2 && arrayWeight(used) + groceryItems[n].getWeight() < weightLimit) {
            temp2[n]++;
            temp2 = recursive(temp2, n);
        } // if
        
        // return bag with most value
        if(arrayCost(temp1) > arrayCost(temp2)) {
            return temp1;
        } else {
            return temp2;
        } // else
        */
        
        
        for(int i = 0; i < connectingLegs.size(); i++) {
            if(connectingLegs.get(i).getDaysAvailable().contains(day)) {
                try {
                    Route temp = (Route)current.clone();
                    if(current)
                } catch (Exception e) {
                    System.out.println("clone failed");
                    System.exit(0);
                } // catch
            } // if
        } // for
    } // cheapestRouteTo
    
    public Route minStepsRouteTo(Location loc, String day) {
        
    }
    
    public Route shortestKmRouteTo(Location loc, String day) {
        
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return name;
    }
} // Location
