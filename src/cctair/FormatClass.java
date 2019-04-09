package cctair;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Italo, Celia and Aman
 */
/**
 * Format class to convert a String in Time or Data.
 */
public class FormatClass {

    public String formatStringDate(String dateString) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = dateString;

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));
            return formatter.format(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateInString;
    }

    // Convert String to time and returning 
    public Date formatStringTime(String timeString) throws ParseException {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        date = sdf.parse(timeString);

        //System.out.println(sdf.format(date));
        return date;

        //sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
        //System.out.println(sdf.format(date));
        //sdf = new SimpleDateFormat("E MMM dd yyyy");
        //System.out.println(sdf.format(date));
    }

    public int compareFlightTime(Date departureTime, Date arrivalTime) {

        return departureTime.compareTo(arrivalTime);

    }

    public boolean validateDate(String date) {

        //String s = "31/02/2009";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false); // aqui o pulo do gato
        try {
            Date currentDate = new Date();
            if (df.parse(date).before(currentDate)) {
                System.out.println("\n-------------------------------------------\n"
                        + "-> Invalid value, please insert a date after the current date."
                        + "\n-------------------------------------------\n");
                return false;
            }

            // data válida
        } catch (ParseException ex) {
            // data inválida
            System.out.println("\n-------------------------------------------\n"
                    + "-> Invalid value, please insert a valid date."
                    + "\n-> Error: " + ex
                    + "\n-------------------------------------------\n");

            return false;
        }
        return true;
    }

}
