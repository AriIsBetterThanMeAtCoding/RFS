
public class TruckDepot extends Location{
    
    public TruckDepot(String n) {
        super(n.toUpperCase());
        
        if(n.length() != 8) {
            System.out.println("TruckDepot names must be 8 characters long");
            System.exit(0);
        }
        
    }
    
    public TruckDepot() {
        super("NONAMETD");
    }
}
