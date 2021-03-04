
public class BikeLeg extends Leg {
    public BikeLeg(Location origin, Location destination, int distanceInKm, String days) {
        super(origin, destination, distanceInKm, days);
        this.costPerKm=1;
    }
}
