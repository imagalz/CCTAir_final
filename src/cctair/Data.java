/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Italo, Celia and Aman
 */
public class Data {

    ArrayList<Flight> flightList = new ArrayList<Flight>();
    AirPlane ap[];
    Pilot p[];

    String flightDate[] = {"27/03/2019", "28/03/2019", "29/03/2019", "30/03/2019", "31/03/2019", "01/04/2019"};
    String flightOrigin[] = {"Dublin", "London", "Paris", "Edinburgh", "Rome", "Berlin"};
    String flightDestination[] = {"Salvador", "Montevideo", "Buenos Aires", "Lima", "Barcelona", "Athenas"};
    String flightDepartureTime[] = {"01:30", "02:00", "02:30", "03:00"};
    String flightarrivalTime[] = {"13:30", "15:00", "15:30", "16:00"};

    public Data() {
    }

    public String[] getFlightDate() {
        return flightDate;
    }

    public String[] getFlightOrigin() {
        return flightOrigin;
    }

    public String[] getFlightDestination() {
        return flightDestination;
    }

    public String[] getFlightDepartureTime() {
        return flightDepartureTime;
    }

    public String[] getFlightarrivalTime() {
        return flightarrivalTime;
    }

    /*public void writeFile() throws IOException {
        File fileToBeModified = new File("list.txt");

        String oldContent = "";

        BufferedReader reader = null;

        FileWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            //Reading all the lines of previous content
            String line = reader.readLine();

            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();

                line = reader.readLine();
            }

            String newContent = oldContent.replaceAll(oldString, newString);

            //Replacing the specific line with new data 
            writer = new FileWriter(fileToBeModified);

            writer.write(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                reader.close();

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/

    public void fileWriterBuffered(String s[], String fname) throws IOException {

        String fileName = "";
        fileName = fileName.concat(fname);
        fileName = fileName.concat(".txt");
        System.out.println("\n" + fileName);

        FileWriter fw = new FileWriter(fileName);
        BufferedWriter WriteFileBuffer = new BufferedWriter(fw);

        for (int i = 0; i < s.length; i++) {
            WriteFileBuffer.write(s[i]);
            WriteFileBuffer.newLine();
        }
        //Sample 03: Close both the Writers
        WriteFileBuffer.close();
        System.out.println("HERE!");

    }

    public void fileReaderBuffered(String fname) throws FileNotFoundException, IOException {

        String fileName = "";
        fileName = fileName.concat(fname);
        fileName = fileName.concat(".txt");
        FileReader fr = new FileReader(fileName);

        BufferedReader ReadFileBuffer = new BufferedReader(fr);

        //Sample 05: Read the text Written 
        // using BufferedWriter
        String st = "";
        while (ReadFileBuffer.readLine() != null){
            
        System.out.println(ReadFileBuffer.readLine());
        }
        
        //Sample 06: Close the Readers
        ReadFileBuffer.close();

    }
}
