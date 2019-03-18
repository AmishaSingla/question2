package com.challenges.chelog;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.*;
import java.io.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Question4{

    /*
    * To solve this exercise,please follow below steps.
    * Step:1 -> In evaluate() call process().
    * Step:2 -> To read all the data present inside the file, call the read().
    * Step:3 -> After reading the data for the given intern X as Arraylist from read(), do the calculation or extraction from the Arraylist according to the asked question.
    * Step:4 -> Return the number of working hour(s)(int datatype) of workspace to the evaluate().
    * Step:5 -> In Evaluate method compare the hour(s) which you get from process() with the argument which you are receiving as hours.
    * Step:6 -> Return true if it matches or false it dosent match.
    * Run the command from the root directory of this project to validate if this Question is answered correctly
    * './gradlew test -Dtest.single='*chelog/Question4''             
    */

    public static ArrayList<String> read(File file, String internName ){
        // read the file, filter the data according to the internName
        // return the filtered data  
        
        return null;
    }

    public static int process(File file, String internName, LocalDate date){
        
        // call the read()
        // process the data in this method which you get from read().
        // return the number of hours which the intern x was used on that particular date.  
        
        return 0;
    }
    
    public static boolean evaluate(File file, String internName, LocalDate date, int hours) {
        int numberOfHours = process(file, internName, date);
        boolean result;
        if(numberOfHours == hours){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    /**
    * This is a convenient method to convert String into a usable Date Object in Java. 
    * This uses new java.time api to convert date found in the provided json into
    * LocalDateTime Object. Please use this method in your implementation. 
    */
    private static LocalDateTime readDateFromString(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'");
        LocalDateTime date = LocalDateTime.parse(dateString, formatter);

        return date;
    }
}