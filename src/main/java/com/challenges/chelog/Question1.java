package com.challenges.chelog;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.*;
import java.io.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
* To solve this exercise,please follow below steps.
* Step:1 -> In evaluate() call process().
* Step:2 -> To read all the data present inside the file, call the read().
* Step:3 -> After reading the data for the given intern X as Arraylist from read(), do the calculation or extraction from the Arraylist according to the asked question.
* Step:4 -> Return the workspace started working date with time (Date datatype) to the evaluate().
* Step:5 -> In Evaluate method compare the date which you get from process() with the argument which you are receiving as date.
* Step:6 -> Return true if it matches or false it dosent match.             
* Run the command from the root directory of this project to validate if this Question is answered correctly
* './gradlew test -Dtest.single='*chelog/Question1''
*/

public class Question1{
    
    /**
    * This method will read the provided log @file, and collects log lines
    * that belong to the @intern (name provided) and returned as List<String>
    */
    public static ArrayList<String> read(File file, String internName){
        return null;
    }
    
    public static LocalDateTime process(File file, String internName, LocalDate date ){
        
        // call the read()
        // process the data in this method which you get from read().
        // return the datetime .  
        
       return null;
    }
    
    public static boolean evaluate(File file, String internName, LocalDate date) throws Exception {
        //DO NOT MODIFY ANYTHING BELOW THIS LINE
        //YOUR CODE GOES HERE
        LocalDateTime dateOnStartEvent = process(file, internName, date);
        LocalDateTime six0Clock = date.atTime(6,00);
        System.out.println("dateOnStartEvent:- "+dateOnStartEvent);
        if(dateOnStartEvent != null){
            if((dateOnStartEvent.getHour() == six0Clock.getHour()) && 
                (dateOnStartEvent.getMinute() == six0Clock.getMinute())){
                return true;
            }
        } 
        return false; 
        //DO NOT MODIFY ANYTHING ABOVE THIS LINE
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