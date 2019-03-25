package com.challenges.chelog1;

import in.vivasa.poorna.tutor.Validation;
import java.time.LocalDate;

import java.util.*;
import java.io.*;

import com.challenges.chelog1.*;

public class Question4_Validation  extends Validation {
    public static final String CHALLENGE = "chelog1";
    public static final String QUESTION = "question4";
    public boolean validate(Map inputs)  {
        File file = (File)inputs.get("file"); 
        String interName=(String)inputs.get("intern");
        int min = (Integer) inputs.get("minutes");      
        LocalDate date = (LocalDate)inputs.get("timestamp");        
        int completeMin = Question4_Solution.solve(file, interName, date);
        if (completeMin != 0) {
            if(completeMin==min){
                return true;
            }
        }
        return false;
    }

}