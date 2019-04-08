
package cctair;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Italo, Celia and Aman.
 * Main Class CCTAir
 */
public class CCTAir {


    public static void main(String[] args) throws ParseException {
/**
 * Airline Logo
 */
         
        
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
        "@ ______   ______  _____   ______   _ @@@@@@@@@\n" +
        "@|  ____| |  ____||_   _| |  __  | |_|  _  __ @\n" +
        "@| |      | |       | |   | |__| |  _  | |/__|@\n" +
        "@| |____  | |____   | |   |  __  | | | |  | @@@\n" +
        "@|______| |______|  |_|   |_|  |_| |_| |_ | @@@\n" +
        "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        
        
        /**
         * Welcome to the user to the Airline Data println
         */
        System.out.println("-------------- CCTAir -------------");
        System.out.println("Welcome to the CCTAir...\n");
        System.out.println("Please, wait until the database is being preparated...\n");
        
        /**
         * Setup the class Setup to manipulate the Data
         */
        setup s = new setup();
        System.out.println("-------- Setup of Database --------");        
        System.out.println("\n");      
        
        /**
         * Invoke methods to Create Pilots, Aircrafts and Flights from Setup Class
         */
        
        s.setP(s.createPilots());
        s.setAp(s.createAircrafts());
        s.createFlights();
        System.out.println("\n\n");   
        
        /**
         * User Flight Creation (up to 5 flight)
         * using the number that the user has entered.
         */
        
        for (int i=0; i<s.getFlightList().size();i++){
            
            System.out.println(s.getFlightList().get(i).toString());
        }
        
        FormatClass fc = new FormatClass();
        //System.out.println(fc.formatStringDate(s.getFlightList().get(0).getFlightDate()));
        fc.formatStringTime(s.getFlightList().get(0).getArrivalTime());
        

        fc.compareFlightTime(fc.formatStringTime("11:00"), fc.formatStringTime("16:00"));
        fc.compareFlightTime(fc.formatStringTime("11:00"), fc.formatStringTime("10:00"));
        fc.compareFlightTime(fc.formatStringTime("11:00"), fc.formatStringTime("11:00"));
        

        /**
         * Welcome the User
         */
      
       Scanner inputUserName = new Scanner(System.in);
       System.out.println("\n\nWelcome to CCTAir! Please enter your full name\n");
       String userName = inputUserName.nextLine();       
   
       /**
        * Invoke method to allow the user to create up to 5 flights, Method name CreateUserFlight, located in Setup class
        */
       s.CreateUserFlight(userName);
        
       for (int i=0; i<s.getFlightList().size();i++){
            
            System.out.println(s.getFlightList().get(i).toString());
        
        }
        
    }
    
    
    
}
