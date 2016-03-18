import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.jxpath.JXPathContext;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class YahooReverseGeoCoder {

	public static void setter(Double lat, Double lng) {
		File xmlFile = new File("yGeo.xml");
		Document xmlDocument = null;
		String prefecture = null;
		
		try {
			String yGeoCoder = ResourceBundle.getBundle("yGeoCoder").getString("apiKey");
			URL url = new URL("http://reverse.search.olp.yahooapis.jp/OpenLocalPlatform/V1/reverseGeoCoder?lat="+lat+"&lon="+lng+yGeoCoder);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String strTemp = "";
			
			FileWriter initFile = new FileWriter(xmlFile);
			initFile.write("");
			while (null != (strTemp = br.readLine())) {
				FileWriter filewriter = new FileWriter(xmlFile, true);
				filewriter.write(strTemp);
				filewriter.close();
			}
			
//			prefecture = SplitAddress.splitAddress(xmlFile.toString());
//			System.out.println(prefecture);
			
			// XMLファイルをDocumentとして読み込む。
			try {
				 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				 DocumentBuilder builder = factory.newDocumentBuilder();
				 xmlDocument = builder.parse(xmlFile);
				} catch (ParserConfigurationException e) {
				 e.printStackTrace();
				} catch (SAXException e) {
				 e.printStackTrace();
				} catch (IOException e) {
				 e.printStackTrace();
				}
			
			BufferedReader brxml =new BufferedReader(new FileReader(xmlFile));
			String readText = null;
			
			System.out.println("BufferdReader↓");
			while ( (readText = brxml.readLine()) != null ){
				System.out.println(readText+"\n");
			}
			brxml.close();
			
			//documentBuilder.extract(xmlFile);

			// 読み込んだDocumnetを元にJXPathContextを生成する。
			//JXPathContext context = JXPathContext.newContext(xmlDocument);
			//System.out.println(context.getValue() + "しーぴーえす");
			//String type = (String) context.getValue("//YDF/Feature/Property/Address");
			//Object pre = context.getValue(arg0)
			//Object prefectures = context.getValue();
			//System.out.println(prefectures.toString() + "nui nui");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
