package com.example.json.MavenTestiranje;

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
        System.out.println( "Hello World!" );
        System.out.println("Testiranje 2 ");
        
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        System.out.println(date.toString());
        
        Date datum = new Date();
        
        System.out.println("Datum je "+datum);
        
        System.out.println("Moja metoda je ");
        Datum();
        pretragaTeksta("Testiranje test 1234444", "\\d+");
        System.out.println("Test");
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
