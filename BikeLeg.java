
public class BikeLeg extends Leg {
    public BikeLeg(Location origin, Location destination, int distanceInKm, String days) {
        
        super(origin, destination, distanceInKm, days, 1);
        
        
        // check if leg is valid
        if(!((origin instanceof BikeDeliveryLocation && (destination instanceof BikeDeliveryLocation 
                || destination instanceof TruckDepot)) 
                || (origin instanceof TruckDepot && destination instanceof BikeDeliveryLocation))) {
            System.out.println("Bike leg origin and destinations must be a TruckDepot and BikeDeliveryStation or"
                    + " 2 BikeDeliveryStations");
            System.exit(0);
        }
        
    } // BikeLeg
} // BikeLeg
