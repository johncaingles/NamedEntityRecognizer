package model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLContentAnalyzer {
	
	public void analyze(XMLFileContents xmlFile, ExtractedInfo extractedInfo) {
		// TODO REGEX HERE
             // String to be scanned to find the pattern.
      String line = "puta ni Emilio Aguinaldo Arroyo at ni John Ganda at ni Kingston";
      String pattern = "ni ([A-Z][a-z]*( [A-Z][a-z]*)?( [A-Z][a-z]*)?)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      while (m.find( )) {
         System.out.println("Found value: " + m.group(1) );
      }
		
	}

}
