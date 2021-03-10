
public class TruckLeg extends Leg {

    // Calls super constructor. Fixed cost/km is $0.58
    public TruckLeg(Location origin, Location destination, int distanceInKm, String days) {
        super(origin, destination, distanceInKm, days, 0.58);
        boolean isValid = (origin instanceof TruckDepot && destination instanceof Airport)
                || (origin instanceof Airport && destination instanceof TruckDepot)
                || (origin instanceof TruckDepot && destination instanceof TruckDepot);

        if (!isValid) {
            System.out.println("Leg did not include the correct destination or origin");
            System.exit(0);
        } // if
    } // TruckLeg
} // Truckleg
