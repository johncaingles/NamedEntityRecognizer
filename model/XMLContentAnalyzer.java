package model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLContentAnalyzer {
	
	public void analyze(XMLFileContents xmlFile, ExtractedInfo extractedInfo) {
      /**ni x*/
      String line = xmlFile.getBodies().get(9);
      String pattern = "[n|N]i ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
      }
         System.out.println("------------------------------");
         
      /**nina x at y*/      
      line = xmlFile.getBodies().get(9);;
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
      line = xmlFile.getBodies().get(9);;
      pattern = "[s|S]i ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      r = Pattern.compile(pattern);

      // Now create matcher object.
      m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
      }
         System.out.println("------------------------------");
         
     /**mag-asawang x at y*/      
      line = xmlFile.getBodies().get(9);;
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
	}
        

}
