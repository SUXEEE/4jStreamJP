import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.jxpath.JXPathContext;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;


public class yahooReverseGeoCoder {

	public static void setter(Double lat, Double lng) {
		// TODO Auto-generated method stub
		Document xmlDocument = null;
		File file = new File("yGeo.xml");
		
		try {
						
			URL url = new URL("http://reverse.search.olp.yahooapis.jp/OpenLocalPlatform/V1/reverseGeoCoder?lat="+lat+"&lon="+lng+"&appid=dj0zaiZpPTRITWljcDkzdExTaCZzPWNvbnN1bWVyc2VjcmV0Jng9ZGE-");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String strTemp = "";
			//String yXml = "";
			
			FileWriter initFile = new FileWriter(file);
			initFile.write("");
			while (null != (strTemp = br.readLine())) {
				System.out.println(strTemp);
				FileWriter filewriter = new FileWriter(file, true);
				filewriter.write(strTemp);
				filewriter.close();
			}
			//System.out.println(strTemp);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
