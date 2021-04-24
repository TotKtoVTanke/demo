package com.viks.demo.mySOAPService;

import org.xml.sax.SAXException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface GetDocument {
    @WebMethod String getDocumentInfo(String identifier) throws ParserConfigurationException, SAXException, IOException;

}
