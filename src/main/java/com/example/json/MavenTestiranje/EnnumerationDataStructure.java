package com.example.json.MavenTestiranje;

import java.util.Enumeration;
import java.util.Vector;

public class EnnumerationDataStructure {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		 Enumeration days,enumeracije;
	      Vector dayNames = new Vector();
	      
	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      
	      
	      days = dayNames.elements();
	      
	      //Moj Vektor
	      Vector brojevi = new Vector();
	      brojevi.add("1");
	      brojevi.add("2");
	      brojevi.add("3");
	      brojevi.add("4");
	      
	      
	      
	      while (days.hasMoreElements()) {
	         System.out.println(days.nextElement()); 
	      }
	      
	      
	      //Moj enummeration 
	      enumeracije=brojevi.elements();
	      while (enumeracije.hasMoreElements())
	      {
	    	  System.out.println(enumeracije.nextElement());
	      }
	      
	      
	}
}
