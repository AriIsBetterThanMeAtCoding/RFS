
public class Flight extends Leg {

    public Flight(Location origin, Location destination, int distanceInKm, String days) {
        super(origin, destination, distanceInKm, days, 0.23);

        boolean isValid = origin instanceof Airport && destination instanceof Airport;

        if (!isValid) {
            System.out.println("Leg did not include the correct destination or origin");
            System.exit(0);
        }
    } // Flight

} // Flight
