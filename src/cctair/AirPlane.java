
package cctair;

/**
 *
 * @author Italo, Celia and Aman.
 */
/**
 Public class Airplane extends the class Aircraft with contents:
 *  (brand, model and capacity)
 */
public class AirPlane extends Aircraft {
/**
 * Setting the variable Pilot Name
 */
        
    String pilotname;
/**
 * Airplane Contructor:
 * @param brand
 * @param model
 * @param capacity 
 * Assigning a Pilot to the Airplane
 */
    public AirPlane(String brand, String model, int capacity) {
        super(brand, model, capacity);
        this.pilotname = "Not set yet";
    }

    public String getPilot() {
        return pilotname;
    }

    public void assignPilot(String pilotname) {
        this.pilotname = pilotname;
    }
    
    /**
     * Return to String, Complete information of the Airplane created.
     * @return 
     */

    @Override
    public String toString() {
        return "Aircraft : " + super.brand + " " + super.model + "Capacity: "+ super.capacity + "seats | Pilot: " + pilotname;
    }

    
    
    
}
