
public class Airport extends Location {

    public Airport() {
        super("NON");
    } // Airport

    public Airport(String n) {
        super(n.toUpperCase());
        if (n.length() != 3) {
            System.out.println("Invalid Airport Name. Airport Name must be 3 characters Long");
            System.exit(0);
        } // if
    } // Airport
} // Airport
