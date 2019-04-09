
package cctair;

/**
 *
 * @author Italo, Celia and Aman.
 */
public class Pilot {
   /**
     * Class for Objet Pilot
     * String name
     * String rating
     * as parameters for Pilot.
   */
    
   String name;
   char rating;

    public Pilot(String name, char rating) {
        this.name = name;
        this.rating = rating;
    }
   
   
   /**
    * Getter and Setters for the Parameters 
    * @return name and rating
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getRating() {
        return rating;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }


    
}
