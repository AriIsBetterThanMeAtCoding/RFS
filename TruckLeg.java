
public class TruckLeg extends Leg {
    
    // Calls super constructor. Fixed cost/km is $0.58
    public TruckLeg(Location origin, Location destination, int distanceInKm, String days) {
        super(origin, destination, distanceInKm, days, 0.58);
    }
}
