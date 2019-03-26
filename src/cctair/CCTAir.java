/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.Date;

/**
 *
 * @author Italo Marcius
 */
public class CCTAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //test
        Flight f = new Flight("Dublin","Cidade del Mexico","05/10/2019");
        f.setPlane(new AirPlane("Fabricio","Boeing","707",300));
        System.out.println(f.toString());
        
    }
    
    
    
}
