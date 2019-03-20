package com.challenges.chelog;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.time.*;
import java.util.*;
import java.io.*;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
* 2).Given the name of an intern, can you tell me if his/her workspace was used
*    on a particular date (date and intern name will be provided as input to the program). 
*    If the workspace was started on any date, it can be assumed that it was used.
* program flow goes like this:
* Step:1 -> In evaluate() invoke process().
* Step:2 -> To read all the data present inside the file, invoke the read().
* Step:3 -> After reading the data for the given intern X as List from read(),
*           In process() do the calculation or extraction from the List according to the asked question.
* Step:4 -> Return Date (LocalDate) if workspace was started for the given intern, 
*             to the evaluate().
* Step:5 -> In Evaluate method compare the date which you get from process() with the argument which you
*           are receiving as date.
* Step:6 -> Return true if it matches or false it doesn't match.             
* Run the command from the root directory of this project to validate if this Question is answered correctly
* './gradlew test -Dtest.single='*chelog/Question2''
*/

public class Question2 {

    /**
     * This method will read the provided log @file, and collects log lines that
     * belong to the @intern (name provided) and returned as List<String>
     * A sample return List<String> look like this:
     * [{logdetails}, {logdetails},..]
     */

    public static List read(File file, String internName) {
        // YOUR CODE GOES HERE
        return null;
    }

    /**
     * process the data in this method which you get from read() and
     * return Date (LocalDate) if workspace was started  for the given intern 
     *        for eg: return 2019-01-23
     */
    public static LocalDate process(File file, String internName, LocalDate date) {
        // DO NOT MODIFY ANYTHING BELOW THIS LINE
        List<String> log = new ArrayList<String>();
        log = read(file, internName);
        // YOUR CODE GOES HERE
        return null;
    }

    /**
     * DO NOT MODIFY evaluate()
     */
    public static boolean evaluate(File file, String internName, LocalDate date) {
        LocalDate finalOutPutDate = process(file, internName, date);
        if (finalOutPutDate != null) {
            if (finalOutPutDate.equals(date)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This is a convenient method to convert String into a usable Date Object in
     * Java. This uses new java.time api to convert date found in the provided json
     * into LocalDate Object. Please use this method in your implementation. Do not
     * modify readDateFromString()
     */
    public static LocalDate readDateFromString(String date) {
        Instant instant = Instant.parse(date);
        LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));
        return result.toLocalDate();
    }
}
