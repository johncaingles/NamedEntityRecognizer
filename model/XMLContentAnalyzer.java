package model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLContentAnalyzer {
	
	public void analyze(XMLFileContents xmlFile, ExtractedInfo extractedInfo) {
      /**ni x*/
      String line = xmlFile.getBodies().get(0);
        String  pattern = "[Nn]i (?!First Gentleman|President|Department|[A-Z][A-Z][A-Z])([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
      }
         System.out.println("------------------------------");
         
      /**nina x at y*/      
      line = xmlFile.getBodies().get(0);;
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
      line = xmlFile.getBodies().get(0);;
      pattern = "[Ss]i (?!First Gentleman|President|[A-Z][A-Z][A-Z]) ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
      }
         System.out.println("------------------------------");
         
     /**mag-asawang x at y*/      
      line = xmlFile.getBodies().get(0);;
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
      line = xmlFile.getBodies().get(0);;
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
      line = xmlFile.getBodies().get(0);;
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
      line = xmlFile.getBodies().get(0);;
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
      line = xmlFile.getBodies().get(0);;
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
    line = xmlFile.getBodies().get(0);
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
    line = xmlFile.getBodies().get(0);
    pattern = "[Ss]i ([A-Z][A-Z][A-Z])";

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
