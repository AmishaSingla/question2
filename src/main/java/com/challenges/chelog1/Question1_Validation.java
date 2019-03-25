package com.challenges.chelog1;

import java.util.*;
import java.io.*;

import groovy.json.internal.LazyMap;
import in.vivasa.poorna.tutor.Validation;

import com.challenges.chelog1.*;

public class Question1_Validation extends Validation  {
    public static final String CHALLENGE = "chelog1"; 
    public static final String QUESTION = "question1";
    public boolean validate(Map inputs){
        File file = (File)inputs.get("file"); 
        List output = Question1_Solution.solve(file);
        if(output != null){
            if(output.size() ==2){
                return true;
            }
        } 
     return false; 
    }

}