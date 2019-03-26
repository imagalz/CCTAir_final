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
public class AirPlane {
    
    String brand;
    String model;
    int capacity;
    String pilot;

    public AirPlane(String brand, String model, int capacity, String pilot) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.pilot = pilot;
    }

    public AirPlane() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPilot() {
        return pilot;
    }

    public void assignPilot(String pilot) {
        this.pilot = pilot;
    }
    
    
}
