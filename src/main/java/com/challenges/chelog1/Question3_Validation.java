package com.challenges.chelog1;

import in.vivasa.poorna.tutor.Validation;
import java.time.LocalDateTime;

import java.util.*;
import java.io.*;

import com.challenges.chelog1.*;

public class Question3_Validation extends Validation{
     public static final String CHALLENGE = "chelog1";
     public static final String QUESTION = "question3";
       public boolean validate(Map inputs) {
        File file = (File)inputs.get("file");
        LocalDateTime  date =(LocalDateTime) inputs.get("timestamp");
        LocalDateTime finalOutPutDate = Question3_Solution.solve(file);
        if (finalOutPutDate != null) {
            if (finalOutPutDate.equals(date)) {
                return true;
            }
        }
        return false;
    }

}