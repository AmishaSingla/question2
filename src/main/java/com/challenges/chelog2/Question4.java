package com.challenges.chelog2;

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

/*
* 4).It is believed that intern X (name will be provided) on Date D (Date will be provided) 
*    used his workspace only for Y hours (hours will be provided and will be rounded up,
*    3 hours 2 mins is 4 hours. 4 hours 50 mins is 5 hours). Can you confirm if its true?
* program flow goes like this:
* Step:1 -> In evaluate() invoke process().
* Step:2 -> To read all the data present inside the file, invoke the read().
* Step:3 -> After reading the data for the given intern X as Arraylist from read(),
*           In process() do the calculation or extraction from the List according to the asked question.
* Step:4 -> Return the number of hours the workspace being used for a given intern,to the evaluate().
* Step:5 -> In Evaluate method compare the date which you get from process() with the argument which 
*            you are receiving as date.
* Step:6 -> Return true if it matches or false it doesn't match.             
* Run the command from the root directory of this project to validate if this Question is answered correctly
* './gradlew test -Dtest.single='*chelog/Question4''
*/
        
    public class Question4{
    /**
     * This method will read the provided log @file, and collects log lines that
     * belong to the @intern (name provided) and returned as ArrayList<String>
     * A sample return ArrayList<String> look like this:
     * [{logdetails}, {logdetails},..]
     */
        
      public static ArrayList<String> read(File file, String internName ){
      
        return null;
    }

        
    /**
    * process the data in this method which you get from read() and
    * return the number of hours the workspace being used for a given intern
    *         eg: return 3 (hours)
    */
        
    public static int process(File file, String internName, LocalDate date){
    //DO NOT MODIFY ANYTHING BELOW THIS LINE  
       ArrayList<String> log = new ArrayList<String>();  
        log = read(file, internName);
        //YOUR CODE GOES HERE 
        return 0;
    }
    
    /**
      * DO NOT MODIFY evaluate()
     */
     
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
    * Do not modify readDateFromString()
    */
    private static LocalDateTime readDateFromString(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'");
        LocalDateTime date = LocalDateTime.parse(dateString, formatter);
        return date;
    }
}