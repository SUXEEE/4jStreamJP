import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;

import org.w3c.dom.Document;


public class yahooReverseGeoCoder {

	public static void setter(Double lat, Double lng) {
		// TODO Auto-generated method stub
		Document xmlDocument = null;
		File file = new File("yGeo.xml");
		
		try {
			String yGeoCorder = ResourceBundle.getBundle("yGeoCorder").getString("apiKey");
			URL url = new URL("http://reverse.search.olp.yahooapis.jp/OpenLocalPlatform/V1/reverseGeoCoder?lat="+lat+"&lon="+lng+yGeoCorder);
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
