/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Italo Marcius
 */
public class CCTAir {

    /**test
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("-------------- CCTAir -------------");
        System.out.println("Welcome to the CCTAir...\n");
        System.out.println("Please, wait until the database is being preparated...\n");
        System.out.println("...\n");
        System.out.println("...\n");
        System.out.println("...\n");
        
        
        setup s = new setup();
        System.out.println("--------- Setup of Database ---------");        
        System.out.println("...\n");
        System.out.println("...\n");
        System.out.println("...\n");
        
        
        
        s.setP(s.createPilots());
        s.setAp(s.createAircrafts());
        s.createFlights();
        
        
        
        System.out.println("--------- JEwjszdkhgsiycy ---------\n\n\n\n");  
        //System.out.println(s.getFlightList());
        
        
        for (int i=0; i<s.getFlightList().size();i++){
            
            System.out.println(s.getFlightList().get(i).toString());
        
        }
        
        //      
        
 
        
        /*test
        Flight f = new Flight("Dublin","Cidade del Mexico","05/10/2019");
        f.setPlane(new AirPlane("Fabricio","Boeing","707",300));
        System.out.println(f.toString());*/
        
    }
    
    
    
}
