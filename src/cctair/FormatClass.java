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
/**
 * Formating String to Time
 */
    public Date formatStringTime(String timeString) throws ParseException {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        date = sdf.parse(timeString);
        return date;

    }

    public int compareFlightTime(Date departureTime, Date arrivalTime) {

        return departureTime.compareTo(arrivalTime);

    }
/**
 * Boolean method to validate the Date
 * @param date
 * @return 
 */
    public boolean validateDate(String date) {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        /**
         * If the date is not valid
         */
        df.setLenient(false); 
        try {
            Date currentDate = new Date();
            if (df.parse(date).before(currentDate)) {
                System.out.println("\n-------------------------------------------\n"
                        + "-> Invalid value, please insert a date after the current date."
                        + "\n-------------------------------------------\n");
                return false;
            }

        /**
         * If the date is valid
         */
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
