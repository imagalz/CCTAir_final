/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;

/**
 *
 * @author Celia, the naughty Peaky Blinder!
 */
public class Pilot {
   /**
     * Set up the variable to Pilot object
   */
    
   String name;
   ArrayList <String> rating = new ArrayList <String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getRating() {
        return rating;
    }

    public void setRating(ArrayList<String> rating) {
        this.rating = rating;
    }

    public Pilot() {
        
    }
   

    
}
