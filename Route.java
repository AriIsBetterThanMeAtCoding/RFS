import java.util.ArrayList;

public class Route{
    ArrayList<Leg> legs = new ArrayList<Leg>();
    
    public double totalCost() {
        double totalCost =0;
        for(int i = 0; i<legs.size(); i++) {
            totalCost +=legs.get(i).getCostPerKm()*legs.get(i).getDistance();
        }
        
        return totalCost;
    }
    
    public int totalDistance() {
        int totalDistance =0;
        for(int i = 0; i<legs.size(); i++) {
            totalDistance +=legs.get(i).getDistance();
        }
        
        return totalDistance;
        
    }
    
    public int totalSteps() {
        return legs.size();
    }
    
    public void addLeg(Leg leg) {
        legs.add(leg);
    }
}
