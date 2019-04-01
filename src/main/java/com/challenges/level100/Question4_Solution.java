package com.challenges.level100;

import java.util.*;
import java.io.*;

import com.challenges.tutor.level100.*;
/**
*4).Given two lists with restaurant names and their respective cost for 2 people, store all the data
*  in a Map and return a smaller map with details of only those restaurants whose cost for 2 is less than USD 200.
* './gradlew test -Dtest.single='*level100/Question4''
*/
public class Question4_Solution{
    /**
    * A sample return Map look like this:
    * [Hot Palayok:100 USD, Denny's:190 USD] 
    */
    public static Map solve(List restaurants,List cost){
       return new Question4_Tutor().solve(restaurants, cost);
    }
}