
public class BikeLeg extends Leg {
    Location o = new Location();
    Location d = new Location();
    int di=0;
    String day = "";
    
    
    
    public BikeLeg(Location origin, Location destination, int distanceInKm, String days) {
        o=origin;
        d=destination;
        di = distance;
        day=days;

    }
}
