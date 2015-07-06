package zjj.dp.abstractfactory.example.util;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import zjj.dp.factory.example.logger.*;

/*
 * author: zjj
 * date: 2015/5/7
 * func: XML解析工具
 */
public class XMLUtil {
	
	/*
	 * @method getBean
	 * @func:解析LoggerConfig.xml
	 * @param:
	 * @return： Object 
	 */
	public static Object getBean()
	{	
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			Document doc;
			builder = dFactory.newDocumentBuilder();
			doc = builder.parse(new File("SkinConfig.xml"));
			NodeList nl = doc.getElementsByTagName("SkinType");
			Node classNode = nl.item(0).getFirstChild();
			String SkinType = classNode.getNodeValue().trim();
			
			Class c = Class.forName(SkinType);
			Object o = c.newInstance();
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
			
	}
	
	
}
