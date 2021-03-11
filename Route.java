import java.util.ArrayList;

public class Route {
    ArrayList<Leg> legs = new ArrayList<Leg>();

    /*
     * Postconditions: returns cost of traversing route
     */
    public double totalCost() {
        double totalCost = 0;
        for (int i = 0; i < legs.size(); i++) {
            totalCost += legs.get(i).getCostPerKm() * legs.get(i).getDistance();
        } // for

        return totalCost;
    } // totalCost

    /*
     * Postconditions: returns total distance of route
     */
    public int totalDistance() {
        int totalDistance = 0;
        for (int i = 0; i < legs.size(); i++) {
            totalDistance += legs.get(i).getDistance();
        } // for

        return totalDistance;

    }// totalDistance

    /*
     * Postconditions: returns number of legs in route
     */
    public int totalSteps() {
        return legs.size();
    } // totalSteps

    /*
     * Postconditions: adds leg to route
     */
    public void addLeg(Leg leg) {
        legs.add(leg);
    } // addleg

    /*
     * Postconditions: returns copy of this route
     */
    public Route clone() {
        Route temp = new Route();

        for (int i = 0; i < legs.size(); i++) {
            temp.addLeg(legs.get(i));
        } // for

        return temp;
    } // clone

    /*
     * Post-Condition: returns whether leg is in the route
     */
    public boolean legInRoute(Leg leg) {
        if (this.legs.contains(leg)) {

            return true;
        } // if
        return false;
    } // leginroute

    public String toString() {
        String str = "";
        str += ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";
        str += " Step: " + totalSteps() + " Distance: " + totalDistance() + " Cost: " + totalCost() + "\n";
        str += "Route Start: \n";

        for (int i = 0; i < legs.size(); i++) {
            str += legs.get(i) + "\n";
        } // for

        str += "Route End.";
        str += "\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        return str;
    } // toString

} // Route
