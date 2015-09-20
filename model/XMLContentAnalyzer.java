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
	
	public void analyze(XMLFileContents xmlFile, ExtractedInfo extractedInfo) {

		// TODO REGEX HERE
	    this.xmlTitles = xmlFile.getTitles();
        this.xmlBodies = xmlFile.getBodies();
        this.xmlDates = xmlFile.getDates();
       
       for(int i = 0; i < 2; i++)
       {
      /**ni x*/
      String line = xmlBodies.get(i);
        String  pattern = "[Nn]i (?!First Gentleman|President|Department|[A-Z][A-Z][A-Z]|Lakas Rep.)([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
      }
         System.out.println("------------------------------");
         
      /**nina x at y*/      
      line = xmlBodies.get(i);
      pattern = "[n|N]ina ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?) (at) ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(5) );
      }
         System.out.println("------------------------------");	
         
         /**si x*/
      line = xmlBodies.get(i);
      pattern = "[Ss]i (?!First Gentleman|President|Department|[A-Z][A-Z][A-Z]|Lakas Rep.) ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
      }
         System.out.println("------------------------------");
         
     /**mag-asawang x at y*/      
      line = xmlBodies.get(i);
      pattern = "[m|M]ag-asawang ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?) (at) ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(5) );
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
      }
         System.out.println("------------------------------");
         
   /**ni XXX*/
    line = xmlBodies.get(i);
    pattern = "[Nn]i ([A-Z][A-Z][A-Z])";

      // Create a Pattern object
    r = Pattern.compile(pattern);

      // Now create matcher object.
    m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
      }
         System.out.println("------------------------------");
         
    /**si XXX*/
    line = xmlBodies.get(i);
    pattern = "[Ss]i ([A-Z][A-Z][A-Z])";

      // Create a Pattern object
    r = Pattern.compile(pattern);

      // Now create matcher object.
    m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
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
      }
         System.out.println("------------------------------");
	}
       
   
        
}
}
