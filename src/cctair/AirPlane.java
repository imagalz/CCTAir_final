/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

/**
 *
 * @author Italo Marcius
 */
public class AirPlane extends Aircraft {
        
    String pilotname;

    public AirPlane(String pilotname, String brand, String model, int capacity) {
        super(brand, model, capacity);
        this.pilotname = pilotname;
    }

    public String getPilot() {
        return pilotname;
    }

    public void assignPilot(String pilotname) {
        this.pilotname = pilotname;
    }
    
    
}
