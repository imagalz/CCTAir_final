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
        
        s.createAircrafts();
        s.createPilots();
                
        
        /* moving it to setup class
        ArrayList<AirPlane> airplanes = new ArrayList();
        airplanes.add(new AirPlane("", "Boeing", "737", 215));
        airplanes.add(new AirPlane("", "Boeing", "747", 350));
        airplanes.add(new AirPlane("", "Boeing", "767", 300));
        airplanes.add(new AirPlane ("", "Airbus", "350", 200));
        airplanes.add(new AirPlane ("", "Airbus", "450", 400));
        airplanes.add(new AirPlane ("", "Airbus", "308", 250));

        ArrayList<Pilot> pilots = new ArrayList();
        pilots.add(new Pilot("Fabricio", "A"));
        pilots.add(new Pilot("Fermin", "A"));
        pilots.add(new Pilot("Aldana", "A"));
        pilots.add(new Pilot("Celia", "B"));
        pilots.add(new Pilot("Italo", "B"));
        pilots.add(new Pilot("Welligton", "B"));
        */
        
        
        //test
        Flight f = new Flight("Dublin","Cidade del Mexico","05/10/2019");
        f.setPlane(new AirPlane("Fabricio","Boeing","707",300));
        System.out.println(f.toString());
        
    }
    
    
    
}
