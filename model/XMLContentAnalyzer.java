package model;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLContentAnalyzer {
    private ArrayList<String> xmlTitles;
    private ArrayList<String> xmlBodies;
    private ArrayList<String> xmlDates;
    
    private ArrayList<String> persons;
    private ArrayList<String> places;
    private ArrayList<String> dates;
    
    private String ignoreForNg =  "First Gentleman|Indonesia|United States|Armed|President|Department|Social Security System|TV|Equitable-PCI Bank|Misamis Oriental|[A-Z][A-Z][A-Z]|Zamboanga del Norte|Benguet|Lakas Rep.";
    private String ignoreForSi = "First Gentleman|President|Department|Justice Secretary|Sr. Police Supt.|Rep.|[A-Z][A-Z][A-Z]|Lakas Rep.";
	
	public void analyze(XMLFileContents xmlFile, ExtractedInfo extractedInfo) {

		// TODO REGEX HERE
	this.xmlTitles = xmlFile.getTitles();
        this.xmlBodies = xmlFile.getBodies();
        this.xmlDates = xmlFile.getDates();
       
       for(int i = 0; i < xmlBodies.size(); i++)
       {
       System.out.println("Body "+i);
      /**ni x*/
      String line = xmlBodies.get(i);
        String  pattern = " [Nn]i (?!First Gentleman|President|Department|[A-Z][A-Z][A-Z]|Lakas Rep.)([A-Z][a-z]* (de la|la)?( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
      /**nina x at y*/      
      line = xmlBodies.get(i);
      pattern = " [n|N]ina ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?) (at) ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(5) );
         persons.add(m.group(1));
         persons.add(m.group(5));
      }
         System.out.println("------------------------------");	
         
         /**si x*/
      line = xmlBodies.get(i);
      pattern = " [Ss]i (?!"+ignoreForSi+")([A-Z][a-zñI]*( [A-Z][a-zñI]*)?( [A-Z][a-zñI]*)?( [A-Z][a-zñI]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
  /**kay x*/
     line = xmlBodies.get(i);
     pattern = " [Kk]ay (?!"+ignoreForSi+")([A-Z][a-zñI]*( [A-Z][a-zñI]*)?( [A-Z][a-zñI]*)?)";

      // Create a Pattern object
    r = Pattern.compile(pattern);

      // Now create matcher object.
     m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
   /**ng x*/
     line = xmlBodies.get(i);
     pattern = " [Nn]g (?!"+ignoreForNg+")([A-Z][a-zñI]*( [A-Z][a-zñI]*)?( [A-Z][a-zñI]*)?)";

      // Create a Pattern object
    r = Pattern.compile(pattern);

      // Now create matcher object.
     m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
     /**mag-asawang x at y*/      
      line = xmlBodies.get(i);
      pattern = " [Mm]ag-asawang ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?) (at) ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(5) );
         persons.add(m.group(1));
         persons.add(m.group(5));
      }
         System.out.println("------------------------------");	
         
  /**sina x, y, z, at a*/      
      line = xmlBodies.get(i);
      pattern = " [Ss]ina ([A-Z][a-z]*), ([A-Z][a-z]*), ([A-Z][a-z]*), at ([A-Z][a-z]*)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
         System.out.println("Found value: " + m.group(3) );
         System.out.println("Found value: " + m.group(4) );
         persons.add(m.group(1));
         persons.add(m.group(2));
         persons.add(m.group(3));
         persons.add(m.group(4));
      }
         System.out.println("------------------------------");	
         
    /**sina XXX at y*/      
      line = xmlBodies.get(i);
      pattern = " [Ss]ina ([A-Z]{3}) at ([A-Z][a-z]*( [A-Z][a-z]*)?) ";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
         persons.add(m.group(1));
         persons.add(m.group(2));
      }
         System.out.println("------------------------------");	
         
      /**secretary x*/
      line = xmlBodies.get(i);
      pattern = "[Ss]ecretary ([A-Z][a-z]*( \\\"[A-Z][a-z]*\\\")?( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
      /**consultant x*/
      line = xmlBodies.get(i);
      pattern = "[Cc]onsultant ([A-Z][a-z]*( \\\"[A-Z][a-z]*\\\")?( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
      /**First Gentleman x*/
      line = xmlBodies.get(i);
      pattern = "[F]irst Gentleman ([A-Z][a-z]*( \\\"[A-Z][a-z]*\\\")?( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
    /**President x*/
      line = xmlBodies.get(i);
      pattern = "Presiden[t|te] ([A-Z][a-z]*( \\\\\\\"[A-Z][a-z]*\\\\\\\")?( [A-Z][a-z]*)?(-[A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
   /**ni XXX*/
    line = xmlBodies.get(i);
    pattern = " [Nn]i ([A-Z][A-Z][A-Z])";

      // Create a Pattern object
    r = Pattern.compile(pattern);

      // Now create matcher object.
    m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
    /**si XXX*/
    line = xmlBodies.get(i);
    pattern = " [Ss]i ([A-Z][A-Z][A-Z])";

      // Create a Pattern object
    r = Pattern.compile(pattern);

      // Now create matcher object.
    m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
    /**Lakas Rep. x*/
      line = xmlBodies.get(i);
      pattern = "Lakas Rep. ([A-Z][a-z]*( \\\\\\\"[A-Z][a-z]*\\\\\\\")?( [A-Z][a-z]*)?(-[A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
     /**Supt. x*/
      line = xmlBodies.get(i);
      pattern = "Supt. ([A-Z][a-z]*( \\\\\\\"[A-Z][a-z]*\\\\\\\")?( [A-Z][a-z]*)?(-[A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
   /**Dr. x*/
      line = xmlBodies.get(i);
      pattern = "Dr. ([A-Z][a-z]*( \\\\\\\"[A-Z][a-z]*\\\\\\\")?( [A-Z][a-z]*)?(-[A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
  /**Ms./Mrs./Mr. x*/
      line = xmlBodies.get(i);
      pattern = "M[r]?s?. ([A-Z][a-z]*( \\\\\\\"[A-Z][a-z]*\\\\\\\")?( [A-Z][a-z]*)?(-[A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
      /**sundalong x*/
      line = xmlBodies.get(i);
      pattern = "sundalong ([A-Z][a-z]*( \\\\\\\"[A-Z][a-z]*\\\\\\\")?( [A-Z][a-z]*)?(-[A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
         
     /**hindi x*/
      line = xmlBodies.get(i);
      pattern = "hindi ([A-Z][a-z]*( \\\\\\\"[A-Z][a-z]*\\\\\\\")?( [A-Z][a-z]*)?(-[A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         persons.add(m.group(1));
      }
         System.out.println("------------------------------");
   
	}
       
   extractedInfo.setPersons(persons);
   extractedInfo.setPlaces(places);
   extractedInfo.setDates(dates);
        
}
}
