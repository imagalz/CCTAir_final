package cctair;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Italo, Celia and Aman.
 */
/**
 *
 * Creation and instantiation of Arrays Flights, Aiplane and Pilot:
 */
public class setup {

    Flight f = new Flight("Dublin", "Nowhere", "21/02/1991");
    ArrayList<Flight> flightList = new ArrayList<Flight>();
    AirPlane ap[];
    Pilot p[];
    FormatClass fc = new FormatClass();

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

    /**
     * Creating Airplanes Array
     *
     * @return array ap
     */
    public AirPlane[] createAircrafts() {

        System.out.println("--------- Creating Airplanes ---------");

        AirPlane a1 = new AirPlane("Boeing", "737", 215);
        AirPlane a2 = new AirPlane("Boeing", "747", 350);
        AirPlane a3 = new AirPlane("Boeing", "767", 300);
        AirPlane a4 = new AirPlane("Airbus", "350", 200);
        AirPlane a5 = new AirPlane("Airbus", "450", 400);
        AirPlane a6 = new AirPlane("Airbus", "308", 250);

        System.out.println("--------- Airplanes created successfully ---------\n");
        AirPlane ap[] = {a1, a2, a3, a4, a5, a6};
        return ap;

    }

    /**
     * Creating Pilot Array
     *
     * @return array p;
     */
    public Pilot[] createPilots() {

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

    /**
     * CheckRates methods for Plane and Pilots Check Rates Plane
     *
     * @return char A or B depending on the capacity of the Airplane.
     *
     */
    public char CheckRatesPlane() {
        if (ap[1].getCapacity() >= 300) {
            return 'A';
        } else {
            return 'B';
        }

    }

    /**
     * Check the Rate for Pilot, searching in Array p[2] .gettingRatting == A
     */
    public int CheckRatesPilot() {

        Scanner myscanner = new Scanner(System.in);
        int userPilot = 0;

        if(CheckRatesPlane() == 'A') {
            
                
                for (int i = 0; i < p.length; i++) {
                    if (p[i].getRating() == "A") {
                        System.out.println(i + " " + p[i].getName());
                    }

                }
                do {
                    //System.out.println("Select the pilot from this list:");

                    userPilot = myscanner.nextInt();
                } while (p[userPilot].getRating() != "A");

        } if (CheckRatesPlane() == 'B'){    
            
                for (int i = 0; i < p.length; i++) {
                    if (p[i].getRating() == "B") {
                        System.out.println(i + " " + p[i].getName());
                    }
                }
                do {
                    //System.out.println("Select the pilot from this list:");
                    userPilot = myscanner.nextInt();
                } while (p[userPilot].getRating() != "B");
                
                
        } else {
            CheckRatesPilot();
        }
        return userPilot;
    }

    /**
     * CreateFlight Class to create 30 flights randomly assigned fromthe arrays:
     * flightDate[],flightOrigin [], flightDestination[], flightDepartureTime[],
     * flightArrivalTime[]
     */
    public void createFlights() {

        String flightDate[] = {"27/03/2019", "28/03/2019", "29/03/2019", "30/03/2019", "31/03/2019", "01/04/2019"};
        String flightOrigin[] = {"Dublin", "London", "Paris", "Edinburgh", "Rome", "Berlin"};
        String flightDestination[] = {"Salvador", "Montevideo", "Buenos Aires", "Lima", "Barcelona", "Athenas"};
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

    /**
     * This method CreateUserFlight allows the user to create up to 5 flight by
     * entering information
     *
     * @param userName
     * @throws ParseException
     */
    public void CreateUserFlight(String userName) throws ParseException {

        int userNumber = -1;
        do {
            try {
                Scanner inputUserNumberOfFlight = new Scanner(System.in);
                System.out.println(userName + ", how  many flights do you want to create? (up to 5)");
                userNumber = inputUserNumberOfFlight.nextInt();
            } catch (Exception e) {
                System.out.println("\n-------------------------------------------\n"
                        + "-> Invalid value, please insert a number between 1 and 5."
                        + "\n-> Error: " + e
                        + "\n-------------------------------------------\n");

            }
        } while (userNumber < 1 || userNumber > 5);

        for (int i = 0; i < userNumber; i++) {

            Scanner myScanner = new Scanner(System.in);

            System.out.println("\n>>>>>> Flight number " + (i + 1));
            System.out.println("\n- Enter the origin city");

            String userOrigin = myScanner.nextLine();

            System.out.println("\n- Enter the destination city");

            String userDestination = myScanner.nextLine();
            
            boolean checkDate = false;
            do {
                System.out.println("\n- Enter the flight date (Please use the format: dd/mm/yy)");
                String userDate = myScanner.nextLine();
                checkDate = fc.validateDate(userDate);
            } while (!checkDate);

            String userTimeDeparture;
            String userTimeArrival;

            int j = 0;

            do {
                
                System.out.println("Enter the departure time for your flight (Please use the format 24hs: 00:00");
                userTimeDeparture = myScanner.nextLine();

                System.out.println("Enter the arrival time for your flight (Please use the format 24hs: 00:00");
                userTimeArrival = myScanner.nextLine();
                Date d1 = fc.formatStringTime(userTimeDeparture);
                Date d2 = fc.formatStringTime(userTimeArrival);
                try {

                    j = fc.compareFlightTime(d1, d2);
                    //System.out.println(j);
                } catch (Exception e) {
                    System.out.println("\n-------------------------------------------\n"
                            + "-> Invalid value, please insert a numbers using the format 00:00."
                            + "\n-> Error: " + e
                            + "\n-------------------------------------------\n");
                }
            } while (j != -1);

            System.out.println("Select a Plane from the list:"
                    + "\n 0 - Boeing 737"
                    + "\n 1 - Boeing 747"
                    + "\n 2 - Boeing 767"
                    + "\n 3 - Airbus 308"
                    + "\n 4 - Airbus 350"
                    + "\n 5 - Airbus 450");

            int userPlane = myScanner.nextInt();

            System.out.println("This airplane capacity is " + ap[userPlane].getCapacity());
            
            
            int userPilot = CheckRatesPilot();


            Flight newFlight = new Flight(userOrigin, userDestination, userDate);
            newFlight.schedule(userTimeDeparture, userTimeArrival);
            newFlight.setPlane(getAp()[userPlane]);
            newFlight.getPlane().assignPilot(getP()[userPilot].getName());
            flightList.add(newFlight);

            //flightList[i] = f;
        }

    }

}
