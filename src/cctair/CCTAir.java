/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.Scanner;

/**
 *
 * @author 
 * Main Class CCTAir
 */
public class CCTAir {


    public static void main(String[] args) {
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
         * Welcome to the user Print Out
         */
        System.out.println("-------------- CCTAir -------------");
        System.out.println("Welcome to the CCTAir...\n");
        System.out.println("Please, wait until the database is being preparated...\n");
        System.out.println("...\n");
        
        /**
         * Preparing the Database to show the flights
         */
        setup s = new setup();
        System.out.println("-------- Setup of Database --------");        
        System.out.println("...\n");      
        
        /**
         * Invoke methods to Create Pilots, Aircrafts and Flights from Setup Class
         */
        
        s.setP(s.createPilots());
        s.setAp(s.createAircrafts());
        s.createFlights();
        System.out.println("\n\n\n\n");   
        
        /**
         * User Flight Creation
         */
        
        for (int i=0; i<s.getFlightList().size();i++){
            
            System.out.println(s.getFlightList().get(i).toString());
        }
        
        //
        FormatClass fc = new FormatClass();
        System.out.println(fc.format(s.getFlightList().get(0).getFlightDate()));
        
        
        /**
         * Welcome the User
         */
      
       Scanner inputUserName = new Scanner(System.in);
       System.out.println("\n\n\nWelcome to CCTAir! Please enter your full name\n");
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
