package AbstractFactory;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class AbstractFactoryEverydayDemo {

	public static void main (String args[]) throws Exception {
		
		String xml = "<document><body><stock>AAPL</stock></body></document>";
		ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
		
		DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder factory = abstractFactory.newDocumentBuilder();
		Document doc = factory.parse(bais);

		doc.getDocumentElement().normalize();
		
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		
		System.out.println(abstractFactory.getClass());
		System.out.println(factory.getClass());
		
				
	}
}
