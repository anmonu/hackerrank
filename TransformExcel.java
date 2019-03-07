package com.hackerrank.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TransformExcel {
	
	public static void main(String[] args) throws IOException{
		String csvFile = "/Users/anurodhkumar/Documents/messagelogsnew.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] message= line.split(cvsSplitBy);
     

            }
         

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
