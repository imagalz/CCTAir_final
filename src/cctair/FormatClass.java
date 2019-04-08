/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Italo Marcius
 */
public class FormatClass {

        
    public String formatStringDate(String dateString){
    
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
    public void formatStringTime(String timeString){

        Date date = new Date();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(date));
        
        date.get
        //sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
        //System.out.println(sdf.format(date));
        //sdf = new SimpleDateFormat("E MMM dd yyyy");
        //System.out.println(sdf.format(date));

    
    
    }
    
}


    

