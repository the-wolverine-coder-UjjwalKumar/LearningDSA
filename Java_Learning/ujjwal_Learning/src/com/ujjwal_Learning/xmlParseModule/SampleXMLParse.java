package com.ujjwal_Learning.xmlParseModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SampleXMLParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			
			// Load the input XML document, parse it and return an instance of the
			// Document class.
			Document document = builder.parse(new File(
					"D:\\LearningDSA\\Java_Learning\\ujjwal_Learning\\src\\com\\ujjwal_Learning\\xmlParseModule\\Sample.xml"));

//			System.out.println(document);
//			System.out.println("XML Tag Name");
//			NodeList list = document.getElementsByTagName("*");
//			for(int i = 0; i < list.getLength(); i++) {
//				Node node = list.item(i);
//				if (node.getNodeType() == Node.ELEMENT_NODE) {
//					Element ele = (Element) list.item(i);
//					System.out.println(ele.getNodeName());
//				}
//				
//			}
			
			
			NodeList nodeList = document.getDocumentElement().getChildNodes();
			
			Element ele = document.getDocumentElement();
			//System.out.println(ele.getNodeName()+" , "+ele.getTextContent());
			
			for(int i=0; i < nodeList.getLength(); i++) {
				
				Node node = nodeList.item(i);
				
				Element elem = (Element) node;
				NodeList list = elem.getElementsByTagName("*");
				for(int j = 0; j < list.getLength(); j++) {
					Node n = list.item(j);
					Element e = (Element) n;
					
//					System.out.println("N :: "+n.getNodeName()+", "+(n.getNodeType()==Node.ELEMENT_NODE)); 
					System.out.println("E :: "+e.getNodeName()+", "+(e.getNodeType()==Node.ELEMENT_NODE)); 

				}
				
				
				//if (node.getNodeType() == Node.ELEMENT_NODE)
				
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
