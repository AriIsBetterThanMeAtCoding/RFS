
public class abstract Location {
    String name;
    ArrayList<Leg> connectingLegs = new ArrayList<Leg>();
    
    public Location () {
        name = "";
    }
}
