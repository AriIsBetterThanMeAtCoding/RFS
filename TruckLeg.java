
public class TruckLeg extends Leg {
    Location o = new Location();
    Location d = new Location();
    int di = 0;
    String day = "";
    
    
    
    public TruckLeg(Location origin, Location destination, int distanceInKm, String days) {
        o=origin;
        d=destination;
        di = distanceInKm;
        day=days;
    }
}
