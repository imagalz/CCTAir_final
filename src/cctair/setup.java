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
public class setup {
    
    Flight f = new Flight("Dublin", "Nowhere", "21/02/1991");
    
    public AirPlane[] createAircrafts(){
    

        System.out.println("--------- Creating Airplanes ---------");
         
        AirPlane a1 = new AirPlane("", "Boeing", "737", 215);
        AirPlane a2 = new AirPlane("", "Boeing", "747", 350);
        AirPlane a3 = new AirPlane("", "Boeing", "767", 300);
        AirPlane a4 = new AirPlane ("", "Airbus", "350", 200);
        AirPlane a5 = new AirPlane ("", "Airbus", "450", 400);
        AirPlane a6 = new AirPlane ("", "Airbus", "308", 250);

        System.out.println("--------- Airplanes created successfully ---------\n");        
        AirPlane ap[] = {a1,a2, a3, a4, a5, a6};
        return ap;
    
    }
    
    //30
     public Pilot[] createPilots(){
         

        System.out.println("--------- Creating Pilots ---------");
         
        Pilot p1 = new Pilot("Fabricio", "A");
        Pilot p2 = new Pilot("Fermin", "A");
        Pilot p3 = new Pilot("Aldana", "A");
        Pilot p4 = new Pilot("Celia", "B");
        Pilot p5 = new Pilot("Italo", "B");
        Pilot p6 = new Pilot("Welligton", "B");
        
        Pilot p[] = {p1, p2, p3, p4, p5, p6};
        
        System.out.println("--------- Pilots created successfully ---------\n");
        
        return p;

    
    
    
    }
    
     public void createFlights(){
     
         
     
     
     
     }
    
    
    
    
}
