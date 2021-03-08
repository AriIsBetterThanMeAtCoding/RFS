import java.util.ArrayList;

public class Route{
    ArrayList<Leg> legs = new ArrayList<Leg>();
    
    // Postconditions: returns cost of traversing route
    public double totalCost() {
        double totalCost =0;
        for(int i = 0; i<legs.size(); i++) {
            totalCost +=legs.get(i).getCostPerKm()*legs.get(i).getDistance();
        }
        
        return totalCost;
    }
    
    // Postconditions: returns total distance of route
    public int totalDistance() {
        int totalDistance =0;
        for(int i = 0; i<legs.size(); i++) {
            totalDistance +=legs.get(i).getDistance();
        }
        
        return totalDistance;
        
    }
    
    // Postconditions: returns number of legs in route
    public int totalSteps() {
        return legs.size();
    }
    
    // Postconditions: adds leg to route
    public void addLeg(Leg leg) {
        legs.add(leg);
    }
    
    // Postconditions: returns copy of this route
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}
