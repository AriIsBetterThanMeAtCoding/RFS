/****************************************************************************
* Name:        Route Finding System
* Author:      Ari & Robert
* Date:        March 11, 2021
* Purpose:     Create transportation networks and finds the best route 
*              between places
*****************************************************************************/

public class TestDriver {

    public static void main(String[] args) {
        SystemManager sm = new SystemManager();
        
        // bike depots
        Location b1 = new BikeDeliveryLocation("BikeDepot1");
        Location b2 = new BikeDeliveryLocation("BikeDepot2");
        Location b3 = new BikeDeliveryLocation("BikeDepot3");
        
        // truck depots
        Location t1 = new TruckDepot("TRUCK001");
        Location t2 = new TruckDepot("TRUCK002");
        Location t3 = new TruckDepot("TRUCK003");
        Location t4 = new TruckDepot("TRUCK004");
        
        // airports
        Location a1 = new Airport("AAA");
        Location a2 = new Airport("BBB");
     
        // add locations to system manager
        sm.addLocation(b1);
        sm.addLocation(b2);
        sm.addLocation(b3);
        sm.addLocation(t1);
        sm.addLocation(t2);
        sm.addLocation(t3);
        sm.addLocation(t4);
        sm.addLocation(a1);
        sm.addLocation(a2);
       
        // add bike legs
        sm.addLeg(new BikeLeg(b1, t3, 1, "MTWRFSU"));
        sm.addLeg(new BikeLeg(t1, b2, 8, "MTWRFSU"));
        sm.addLeg(new BikeLeg(b2, t2, 2, "MTWRFSU"));
        sm.addLeg(new BikeLeg(t4, b3, 2, "MTWRFSU"));
        
        // add truck legs
        sm.addLeg(new TruckLeg(t1, t2, 11, "MTWRFSU"));
        sm.addLeg(new TruckLeg(t2, a2, 36, "MTWRFSU"));
        sm.addLeg(new TruckLeg(a2, t4, 42, "MTWRFSU"));
        sm.addLeg(new TruckLeg(t2, t4, 120, "MTWRFSU")); 
        sm.addLeg(new TruckLeg(t3, a1, 19, "MTWRFSU"));
        
        // add flights
        sm.addLeg(new Flight(a1, a2, 221, "MTWRFSU"));
       
        // Testing Error Checking
        //sm.addLeg(new Flight(b1, b2, 10, "MTW"));
        //sm.addLeg(new Flight(t1, t2, 10, "MTW"));
        //sm.addLeg(new Flight(b1, t2, 10, "MTW"));
        //sm.addLeg(new Flight(t1, b2, 10, "MTW"));
        
        //sm.addLeg(new TruckLeg(b1, b2, 10, "MTW"));
        //sm.addLeg(new TruckLeg(t1, b2, 10, "MTW"));
        //sm.addLeg(new TruckLeg(b2, t2, 10, "MTW"));
        //sm.addLeg(new TruckLeg(a1, a2, 10, "MTW"));
        
        // TruckDepot t1 to TruckDepot t4
        System.out.println("------- t1 to t4 ----------");
        Route rA = sm.findCheapestRoute(sm.findLocation("TRUCK001"), sm.findLocation("TRUCK004"), "M");
        System.out.println("\n\nCheapest Route: ");
        System.out.println(rA);

        Route rB = sm.findShortestKmRoute(sm.findLocation("TRUCK001"), sm.findLocation("TRUCK004"), "M");
        System.out.println("\n\nShortest Route:\n " + rB);

        System.out.println(""); 

        //BikeDepot 1 to BikeDepot 3
        System.out.println("------- b1 to b3 ----------");
        Route r1 = sm.findCheapestRoute(sm.findLocation("BikeDepot1"), sm.findLocation("BikeDepot3"),"M");
        System.out.println("Cheapest: " + r1);
        Route r2 = sm.findShortestKmRoute(sm.findLocation("BikeDepot1"), sm.findLocation("BikeDepot3"), "M");
        System.out.println("\n\nShortest Route:\n " + r2);

       
        
        // TruckDepot 4 to BikeDepot 1  NOT POSSIBLE
        System.out.println("------- 4 to 5 ----------");
        r1 = sm.findCheapestRoute(sm.findLocation("TRUCK004"), sm.findLocation("BikeDepot1"),"M");
        System.out.println("\n\nCheapest: ");
        System.out.println(r1);
        r2 = sm.findShortestKmRoute(sm.findLocation("TRUCK004"), sm.findLocation("BikeDepot1"), "M");
        System.out.println("\n\nShortest Route:\n " + r2);
        


    }

}
