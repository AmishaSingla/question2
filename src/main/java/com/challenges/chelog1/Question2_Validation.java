package com.challenges.chelog1;

import in.vivasa.poorna.tutor.Validation;
import com.challenges.chelog1.*;

import java.util.*;
import java.io.*;

public class Question2_Validation extends Validation{
   public static final String CHALLENGE = "chelog1";
    public static final String QUESTION = "question2";
     public boolean validate(Map inputs){
        File file = (File)inputs.get("file"); 
        String value = (String)inputs.get("timestamp");
        String output = Question2_Solution.solve(file);
        if (output != "") {
            if (output.equals(value)) {
                return true;
            }
        }
        return false;
    }

}