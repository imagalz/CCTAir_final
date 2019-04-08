
package cctair;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Italo, Celia and Aman.
 */
public class setup {
    
    Flight f = new Flight("Dublin", "Nowhere", "21/02/1991");
    ArrayList<Flight> flightList =  new ArrayList<Flight>();
    AirPlane ap[];
    Pilot p[];

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

    public Pilot[] getP() {
        return p;
    }

    public void setP(Pilot[] p) {
        this.p = p;
    }
    
    

    public AirPlane[] getAp() {
        return ap;
    }

    public void setAp(AirPlane[] ap) {
        this.ap = ap;
    }
    
    public AirPlane[] createAircrafts(){
    

        System.out.println("--------- Creating Airplanes ---------");
         
        AirPlane a1 = new AirPlane( "Boeing", "737", 215);
        AirPlane a2 = new AirPlane( "Boeing", "747", 350);
        AirPlane a3 = new AirPlane( "Boeing", "767", 300);
        AirPlane a4 = new AirPlane ( "Airbus", "350", 200);
        AirPlane a5 = new AirPlane ( "Airbus", "450", 400);
        AirPlane a6 = new AirPlane ( "Airbus", "308", 250);

        System.out.println("--------- Airplanes created successfully ---------\n");        
        AirPlane ap[] = {a1,a2, a3, a4, a5, a6};
        return ap;
    
    }
    
    
     public Pilot[] createPilots(){
         

        System.out.println("--------- Creating Pilots ---------");
         
        Pilot p1 = new Pilot("Fabricio", "A");
        Pilot p2 = new Pilot("Fermin", "A");
        Pilot p3 = new Pilot("Aldana", "A");
        Pilot p4 = new Pilot("Celia", "B");
        Pilot p5 = new Pilot("Italo", "B");
        Pilot p6 = new Pilot("Aman", "B");
        
        Pilot p[] = {p1, p2, p3, p4, p5, p6};
        
        System.out.println("--------- Pilots created successfully ---------\n");
        
        return p;

    
    }
     
public char CheckRatesPlane(){
   // Arrays.(array).indexOf(4);
    if (ap[1].getCapacity() >= 300){ 
      return 'A';
        }
        else return 'B';

    }
    public void CheckRatesPilot() {
        
        
        
        
        switch (CheckRatesPlane()){
        case 'A':
            
       
        for(int i=0; i < p.length;i++){
            if(p[i].getRating()=="A"){
                System.out.println(p[i].getName());
            }
        
        }
        
        break;
       case 'B': 
       for(int i=0; i < p.length;i++){
            if(p[i].getRating()=="B "){
                System.out.println(p[i].getName());
            }

        break;
        }

    }

    }   
     
     public void createFlights(){
     

        String flightDate[] = {"27/03/2019", "28/03/2019", "29/03/2019", "30/03/2019", "31/03/2019", "01/04/2019"};
        String flightOrigin[] = {"Dublin", "London", "Paris", "Edinburgh", "Rome","Berlin"};
        String flightDestination[] = {"Salvador", "Montevideo", "Buenos Aires", "Lima", "Barcelona","Athenas"};
        String flightDepartureTime[] = {"01:30", "02:00", "02:30", "03:00"};
        String flightarrivalTime[] = {"13:30", "15:00", "15:30", "16:00"};


        for (int i = 0; i < 30; i++) {

            Random r = new Random();
            //date
            int rfd = r.nextInt(6);
            //random flight Origin
            int rfo = r.nextInt(6);
            //random flight Destination
            int rpd = r.nextInt(6);
            //random flight Departure Time
            int rfdt = r.nextInt(4);
            //random flight Arrival Time
            int rfat = r.nextInt(4);
            //random flight airplane
            int rap = r.nextInt(6);
            //random flight pilot
            int rp = r.nextInt(6);

            Flight flight = new Flight(flightOrigin[rfo], flightDestination[rpd], flightDate[rfd]);
            flight.schedule(flightarrivalTime[rfat], flightDepartureTime[rfdt]);
            flight.setPlane(getAp()[rap]);
            flight.getPlane().assignPilot(getP()[rp].getName());
            flightList.add(flight);
            
        }
        
    }
     
     public void CreateUserFlight(String userName){

        Scanner inputUserNumberOfFlight = new Scanner(System.in); 

        System.out.println( userName + ", how  many flights do you want to create?");

        int userNumber = inputUserNumberOfFlight.nextInt(); 
        if(userNumber<=5){
            for (int i = 0; i < userNumber; i++) {
            
            Scanner myScanner = new Scanner(System.in);
            
            System.out.println("\n>>>>>> Flight number "+(i+1));
            System.out.println("\n- Enter the origin city");
            
            String userOrigin = myScanner.nextLine();

            System.out.println("\n- Enter the destination city");
            
            String userDestination = myScanner.nextLine();
            
            System.out.println("\n- Enter the flight date (Please use the format: dd/mm/yy)");

            String userDate = myScanner.nextLine();
            
            System.out.println("Enter the departure time for your flight (Please use the format 24hs: 00:00");
                        
            String userTimeDeparture = myScanner.nextLine();
            
            System.out.println("Enter the arrival time for your flight (Please use the format 24hs: 00:00");
            
            String userTimeArrival = myScanner.nextLine();
            
            
            
            
            System.out.println("Select a Plane from the list:"
                    + "\n 1 - Boeing 737"
                    + "\n 2 - Boeing 747"
                    + "\n 3 - Boeing 767"
                    + "\n 4 - Airbus 308"
                    + "\n 5 - Airbus 350"
                    + "\n 6 - Airbus 450" );

            int userPlane = myScanner.nextInt() ;

            CheckRatesPilot();
            
            System.out.println("This airplane capacity is " + ap[userPlane].getCapacity() + " and its pilots are:" );
            

            String userPilot = myScanner.nextLine();
            
            System.out.println("Enter your Pilot name");

                Random r = new Random();

                int userrfd = r.nextInt(1);

                //String flightDepartureTime[] = {"1:30", "2:00", "2:30", "3:00"};
                //String flightarrivalTime[] = {"15:30", "17:00", "17:30", "18:00"};
                //random flight Departure Time
                int rfdt = r.nextInt(4);
                //random flight Arrival Time
                int rfat = r.nextInt(4);
                //random flight airplane
                int rap = r.nextInt(6);
                //random flight pilot
                int rp = r.nextInt(6);
               
               Flight newFlight = new Flight(userOrigin, userDestination, userDate);
               //newflight.schedule(flightarrivalTime[rfat], flightDepartureTime[rfdt]);
               newFlight.setPlane(getAp()[userPlane]);
               newFlight.getPlane().assignPilot(getP()[rp].getName());
               flightList.add(newFlight);


                //flightList[i] = f;
            }
        } else {
                    System.out.println("Please, you are allow to create up to 5 flights, "
                            + "enter your number again");
                    CreateUserFlight(userName);
                    }
        
        }
     

         
}         
     


