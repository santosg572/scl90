/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// -----------------------------------------------------------------------------
// File_Cpy.java
// -----------------------------------------------------------------------------

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.*;
/**
 * -----------------------------------------------------------------------------
 * This program takes the input of one file and outputs it to another in plain 
 * text.
 * -----------------------------------------------------------------------------
 */

public class File_Cpy {

    public static void doFile_Cpy(String file_in, String file_ou) {

        try {
        
		   String ss = new File(".").getAbsolutePath();
		   int i = ss.lastIndexOf(".");
           String pat = ss.substring(0,i);
            // input/output file names
            String inputFileName  = pat+file_in;
            String outputFileName = pat+file_ou;

            // Create FileReader Object
            FileReader inputFileReader   = new FileReader(inputFileName);
            FileWriter outputFileReader  = new FileWriter(outputFileName);

            // Create Buffered/PrintWriter Objects
            BufferedReader inputStream   = new BufferedReader(inputFileReader);
            PrintWriter    outputStream  = new PrintWriter(outputFileReader);

            String inLine = null;

            while ((inLine = inputStream.readLine()) != null) {
                outputStream.println(inLine);
            }

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {

            System.out.println("IOException:");
            e.printStackTrace();

        }

    }
}

