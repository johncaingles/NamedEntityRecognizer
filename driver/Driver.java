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
		
		/** Save data to extracted info */
		ExtractedInfo extractedInfo = new ExtractedInfo();
		XMLContentAnalyzer contentReader = new XMLContentAnalyzer();
		contentReader.analyze(xmlFile, extractedInfo);
		
		/** Create txt file */
		OutputGenerator outputGenerator = new OutputGenerator();
		outputGenerator.createTxtResultsFromExtractedInfo(extractedInfo);
	}
}
