package zjj.dp.simplefactory.util;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * author: zjj
 * date: 2015/5/6
 * func: XML解析工具
 */
public class XMLUtil {
	
	/*
	 * @method getProductType
	 * @func:解析config.xml
	 * @param:
	 * @return： String 
	 */
	public static String getProductType()
	{	
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			Document doc;
			builder = dFactory.newDocumentBuilder();
			doc = builder.parse(new File("config.xml"));
			NodeList nl = doc.getElementsByTagName("productType");
			Node classNode = nl.item(0).getFirstChild();
			String productType = classNode.getNodeValue().trim();
			return productType;
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
}
