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
* 1).Please determine if the workspace of Intern X on Date D was started at 
*    6:00 am in the morning? X and D will be provided as input.
* program flow goes like this:
* Step:1 -> In evaluate() invoke process().
* Step:2 -> To read all the data present inside the file, invoke the read().
* Step:3 -> After reading the data for the given intern X as Arraylist from read(),
*           In process() do the calculation or extraction from the List according to the asked question.
* Step:4 -> Return Date with time (LocalDateTime) for a given intern to the evaluate().
* Step:5 -> In Evaluate method compare the Date with time which you get from process() 
*           with the argument which you are receiving as date.
* Step:6 -> Return true if it matches or false it doesn't match.             
* Run the command from the root directory of this project to validate if this Question is answered correctly
* './gradlew test -Dtest.single='*chelog/Question1''
*/

public class Question1 {

    /**
     * This method will read the provided log @file, and collects log lines that
     * belong to the @intern (name provided) and returned as ArrayList<String>
     * A sample return ArrayList<String> look like this:
     * [{logdetails}, {logdetails},..]
     */
    public static ArrayList<String> read(File file, String internName) {
        return null;
    }

    /**
     * process the data in this method which you get from read() and 
     * return Date with time (LocalDateTime) for a given intern
     *         return eg: 2019-01-25T04:50:40.290999091Z
     */
    public static LocalDateTime process(File file, String internName, LocalDate date) {
        // DO NOT MODIFY ANYTHING BELOW THIS LINE
        ArrayList<String> log = new ArrayList<String>();
        log = read(file, internName);
        // YOUR CODE GOES HERE
        return null;
    }

    /**
     * DO NOT MODIFY evaluate()
     */
    public static boolean evaluate(File file, String internName, LocalDate date) throws Exception {
        LocalDateTime dateOnStartEvent = process(file, internName, date);
        LocalDateTime six0Clock = date.atTime(6, 00);
        System.out.println("dateOnStartEvent:- " + dateOnStartEvent);
        if (dateOnStartEvent != null) {
            if ((dateOnStartEvent.getHour() == six0Clock.getHour())
                    && (dateOnStartEvent.getMinute() == six0Clock.getMinute())) {
                return true;
            }
        }
        return false;
    }

    /**
     * This is a convenient method to convert String into a usable Date Object in
     * Java. This uses new java.time api to convert date found in the provided json
     * into LocalDateTime Object. Please use this method in your implementation. Do
     * not modify readDateFromString()
     */
    private static LocalDateTime readDateFromString(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'");
        LocalDateTime date = LocalDateTime.parse(dateString, formatter);
        return date;
    }
}