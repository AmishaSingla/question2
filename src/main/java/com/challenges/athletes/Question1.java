package com.challenges.athletes;


import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import java.util.*;
import java.io.*;

/**
* Run the command from the root directory of this project to validate if this Question is answered correctly
* './gradlew test -Dtest.single=Question1'
**/
public class Question1{
    
    /**
    * A sample return list look like this:
    * ['Player1', 'Player2', 'Player5']
    * 
    */

    public static List playerGames(File file){
        Map<String, String> map = new LinkedHashMap<>();
        List <String> set  = new ArrayList<>();
      try {
          InputStream ExcelFileToRead = new FileInputStream(file);
          XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
          XSSFSheet wbsheet = wb.getSheetAt(0);
          XSSFRow newRow = null;
          Iterator rows = wbsheet.rowIterator();
          int rowNum = 0;
          while (rows.hasNext()) {
              newRow = (XSSFRow) rows.next();
              if(rowNum>0) {
                  XSSFCell key = newRow.getCell(1);
                  XSSFCell value = newRow.getCell(12);
                 // System.out.println(key+ " ***************" + value);
                  if(map.containsKey(key.toString())) {
                      String value2 = map.get(key.toString());
                      if(!value2.equals(value.toString())) {
                          set.add(key.toString());
                      }
                  }
                  else {
                      map.put(key.toString(), value.toString());
                  }
              }
              rowNum++;
          }
          for (String s : set) {
               System.out.println(s);
           }
      } catch (Exception ie) {
          ie.printStackTrace(System.out);
      }
        return set;
    }    

}
