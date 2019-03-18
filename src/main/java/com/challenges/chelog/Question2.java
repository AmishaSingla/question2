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

public class Question2 {

    /**
     * This method returns the downtime of a workspace in rounded minutes
     *
     */
    public static List read(File file, String internName, LocalDate date) {
        return null;
    }

    public static LocalDate process(File file, String internName, LocalDate date) {   
        return null;
    }

    public static boolean evaluate(File file, String internName, LocalDate date) {
        boolean checkResult = false;
        LocalDate finalOutPutDate = process(file, internName, date);
        if (finalOutPutDate != null) {
            if (finalOutPutDate.equals(date)) {
                checkResult = true;
            }
        }
        return checkResult;
    }

    /**
     * This is a convenient method to convert String into a usable Date Object in
     * Java. This uses new java.time api to convert date found in the provided json
     * into LocalDate Object. Please use this method in your implementation.
     */
    public static LocalDate readDateFromString(String date) {
        Instant instant = Instant.parse(date);
        LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));
        return result.toLocalDate();
    }
}
