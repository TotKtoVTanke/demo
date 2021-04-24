package com.viks.demo.workWithXML;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class DOMWorker {

    private File fileWithXMLDocument;

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    DocumentBuilder builder = factory.newDocumentBuilder();

    String[] paramMas;


    public DOMWorker(File fileWithXMLDocument) throws ParserConfigurationException {
        this.fileWithXMLDocument = fileWithXMLDocument;
    }

    public String lookingForDocumentAtributes(String param) throws IOException, SAXException {

        paramMas = param.split("\\.");

        List<String> list = Arrays.asList(paramMas);

        Deque<String> queue = new ArrayDeque<>(list);

        String searchTag = queue.pollFirst();

        Document document = builder.parse(fileWithXMLDocument);

        NodeList documentCode = document.getDocumentElement().getElementsByTagName(paramMas[0]);

        if (paramMas.length>1) return getTagValue(documentCode.item(0),paramMas[1],1);

        else return documentCode.item(0).getAttributes().getNamedItem(paramMas[0]).getTextContent();
    }

    private String getTagValue(Node node, String param, int level){
        if(level == paramMas.length-1) return node.getChildNodes().item(0).getTextContent();
        else {
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeName().equals(param)) return getTagValue(nodeList.item(i), paramMas[++level], level);
        }
        return "";
        }
    }
}
