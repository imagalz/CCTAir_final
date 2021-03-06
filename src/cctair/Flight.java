package cctair;

/**
 *
 * @author Italo, Celia and Aman
 */
public class Flight {

    /**
     * Store data for the Flight - origin and destination - departure time 
     */
    String origin;
    String destination;
    String departureTime;
    String arrivalTime;
    String flightDate;
    AirPlane Plane = new AirPlane("", "", 500);// - aircraft assigned (this should be an object);
 
    public Flight() {
    }
    /**
     * A constructor which accepts data (except for departure time and arrival
     * time)
     */
    public Flight(String origin, String destination, String flightDate) {
        this.origin = origin;
        this.destination = destination;
        this.flightDate = flightDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        FormatClass fc = new FormatClass();

        this.flightDate = fc.formatStringDate(flightDate);
    }

    public AirPlane getPlane() {
        return Plane;
    }

    public void setPlane(AirPlane Plane) {
        this.Plane = Plane;
    }

    public void schedule(String arrivalTime) {

        this.arrivalTime = arrivalTime;

    }

    public void schedule(String arrivalTime, String departureTime) {

        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    /**
     * Creating String to Board with Flight Information
     */
    @Override
    public String toString() {
        return "\n\n* ===== Flight Information: ===== *\n"
                + "Date:" + flightDate
                + "\nFrom:" + origin
                + "\nTo:" + destination
                + "\nDeparture Time:" + departureTime
                + "\nArrival Time:" + arrivalTime
                + "\nPlane Information >> "
                + "Aircraft " + Plane.getBrand() + " " + Plane.getModel()
                + " Capacity: " + Plane.getCapacity()
                + " seats " + "Pilot: " + Plane.getPilot();

    }

}
