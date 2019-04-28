package com.example.json;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      System.out.println("Test key");
      System.out.println("Testiranje 2");
      System.out.println("Testiranje 3");
    }
    
    
    public static void Datum ()
    {
    	 Date dNow = new Date( );
         SimpleDateFormat ft = 
         new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

         System.out.println("Current Date: " + ft.format(dNow));
    }
    
    public static void pretragaTeksta(String text,String patern)
    {	
    	
    	 // String to be scanned to find the pattern.
        String line = text;
        String pattern = patern;

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
           System.out.println("Pocetak nalazenja : " + m.start() +" kraj pronalazenja" +m.end());
          
        }else {
           System.out.println("NO MATCH");
        }
        
       
    }
}
