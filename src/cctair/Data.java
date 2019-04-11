/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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

    public void writeFile() throws IOException {
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
    }

    public void fileWriterBuffered(String s[]) throws IOException {

        FileWriter fw = new FileWriter("C:\\Users\\Italo Marcius\\Documents\\NetBeansProjects\\CCTAir\\TestFile.txt");
        BufferedWriter WriteFileBuffer = new BufferedWriter(fw);

        for (int i = 0; i < s.length; i++) {
            WriteFileBuffer.write(s[i]);
            WriteFileBuffer.newLine();
        }
        //Sample 03: Close both the Writers
        WriteFileBuffer.close();
        System.out.println("HERE!");

    }
}
