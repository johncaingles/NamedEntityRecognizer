package driver;

import model.ExtractedInfo;
import model.OutputGenerator;
import model.XMLContentAnalyzer;
import model.XMLFileContents;
import utilities.XmlContentParser;
import view.FileChooser;

public class Driver {
	public static void main(String[] args) {
		
		String fileName = new FileChooser().promptUserForFile();
		
		/** Read xml */
		XMLFileContents xmlFile = XmlContentParser.parseXML(fileName);
                //System.out.println(xmlFile.getBodies().get(1));
		
		/** Save data to extracted info */
		ExtractedInfo extractedInfo = new ExtractedInfo();
		XMLContentAnalyzer contentReader = new XMLContentAnalyzer();
<<<<<<< HEAD
		contentReader.analyzePeople(xmlFile, extractedInfo);
=======
		contentReader.analyze(xmlFile, extractedInfo);
>>>>>>> e5248d4731b5c59dca16cc2d251a7159380fe67f
                
                /**testings*/
                
		
		/** Create txt file */
		OutputGenerator outputGenerator = new OutputGenerator();
		outputGenerator.createTxtResultsFromExtractedInfo(extractedInfo);
	}
}
