/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
        
        // Fancy and useless logo
        
        /*System.out.println(" ______   ______  _____   ______   _\n" +
                            "|  ____| |  ____||_   _| |  __  | |_|  _  __\n" +
                            "| |      | |       | |   | |__| |  _  | |/__|\n" +
                            "| |____  | |____   | |   |  __  | | | |  |\n" +
                            "|______| |______|  |_|   |_|  |_| |_| |_ | ");*/  
        
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
        "@ ______   ______  _____   ______   _ @@@@@@@@@\n" +
        "@|  ____| |  ____||_   _| |  __  | |_|  _  __ @\n" +
        "@| |      | |       | |   | |__| |  _  | |/__|@\n" +
        "@| |____  | |____   | |   |  __  | | | |  | @@@\n" +
        "@|______| |______|  |_|   |_|  |_| |_| |_ | @@@\n" +
        "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        
        
        
        System.out.println("-------------- CCTAir -------------");
        System.out.println("Welcome to the CCTAir...\n");
        System.out.println("Please, wait until the database is being preparated...\n");
        System.out.println("...\n");
        
        
        setup s = new setup();
        System.out.println("-------- Setup of Database --------");        
        System.out.println("...\n");      
        
        
        s.setP(s.createPilots());
        s.setAp(s.createAircrafts());
        s.createFlights();
        
        
        
        System.out.println("\n\n\n\n");          
        
        for (int i=0; i<s.getFlightList().size();i++){
            
            System.out.println(s.getFlightList().get(i).toString());
        }
      
       Scanner inputUserName = new Scanner(System.in);
       System.out.println("\n\n\nWelcome to CCTAir! Please enter your full name\n");
       String userName = inputUserName.nextLine();       
   
 
       s.CreateUserFlight(userName);
        
       for (int i=0; i<s.getFlightList().size();i++){
            
            System.out.println(s.getFlightList().get(i).toString());
        
        }
        
    }
    
    
    
}
