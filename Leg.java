
public abstract class Leg {
    Location origin = new Location();
    Location destination = new Location();
    String daysAvailable = "";
    int distance =0;
    double costPerKm = 0;
    
    public Leg() {
        o=origin;
        d=destination;
        di = distance;
        day=days;
    }
}
