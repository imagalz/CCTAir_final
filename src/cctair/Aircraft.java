/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

/**
 *
 * @author 
 */
/**
 * Super Class Aircraft:
 */
public class Aircraft {

    String type = "";
    String brand = "";
    int capacity = 0;
    String model = "";
    
    /**
     * Aircraft constructor parameters:
     * @param brand
     * @param model
     * @param capacity 
     */
    
    public Aircraft (String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    /**
     * Getter and Setters for String Brand
     * @return 
     */

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
/**
 * Getter and Setter for String Model
 * @return 
 */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
/**
 * Getters and Setters for int Capacity.
 * @return 
 */
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
}
