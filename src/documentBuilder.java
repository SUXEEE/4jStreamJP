import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class documentBuilder{
	
	public static void extract(File file){
//	//DocumentBuilder
//	DocumentBuilderFactory factory      = DocumentBuilderFactory.newInstance();
//	DocumentBuilder builder = factory.newDocumentBuilder();
//	Document doc = builder.parse(xmlFile);
//	Element root = doc.getDocumentElement();
//	//ルート要素のノード名を取得する
//	System.out.println("ノード名：" +root.getNodeName());
//	//ルート要素の子ノードを取得する
//	NodeList rootChildren = root.getChildNodes();
//	System.out.println("子要素の数：" + rootChildren.getLength());
//	System.out.println("------------------");
//	for(int i=0; i < rootChildren.getLength(); i++) {
//		Node node = rootChildren.item(i);
//		if (node.getNodeType() == Node.ELEMENT_NODE) {
//			Element element = (Element)node;
//			if (element.getNodeName().equals("Feature")) {
//				System.out.println("Feature：" + element.getAttribute("Feature"));
//				NodeList personChildren = node.getChildNodes();
//				for (int j=0; j < personChildren.getLength(); j++) {
//					Node personNode = personChildren.item(j);
//					if (personNode.getNodeType() == Node.ELEMENT_NODE) {
//						if (personNode.getNodeName().equals("Property")) {
//							System.out.println("Property：" + personNode.getTextContent());
//						} else if (personNode.getNodeName().equals("ResultInfo")) {
//							System.out.println("result:" + personNode.getTextContent());
//						}
//					}
//				}
//				System.out.println("------------------");
//			}
//		}
//	}
	}
}
