package om.viks.demo.workWithXML;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMWorker {

    private String documentCode;

    private String patientSurname;

    private File fileWithXMLDocument;

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    DocumentBuilder builder = factory.newDocumentBuilder();

    String[] paramMas;


    public DOMWorker(File fileWithXMLDocument) throws ParserConfigurationException, IOException, SAXException {
        this.fileWithXMLDocument = fileWithXMLDocument;
    }

    public void lookingForDocumentAtributes(String param) throws IOException, SAXException {
        paramMas = param.split("\\.");
        Document document = builder.parse(fileWithXMLDocument);



        NodeList documentCode = document.getDocumentElement().getElementsByTagName("patient");

        System.out.println(getTagValue(documentCode.item(0),paramMas[1],1));
      /*  for (int i = 0; i < documentCode.getLength(); i++) {
            Node node = documentCode.item(i);
            NamedNodeMap namedNodeMap = node.getAttributes();
            NodeList patientList = node.getChildNodes();
            for (int j = 0; j < patientList.getLength(); j++) {
                System.out.println(patientList.item(j).getNodeName());
            }
           // System.out.println(namedNodeMap.);

        }*/
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
