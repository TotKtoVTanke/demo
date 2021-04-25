package com.viks.demo.mySOAPService;
import com.viks.demo.generatedSrcFromWSDL.GetDocumentRequest;
import com.viks.demo.generatedSrcFromWSDL.GetDocumentResponse;
import com.viks.demo.generatedSrcFromWSDL.NewXds;
import com.viks.demo.generatedSrcFromWSDL.ObjectFactory;
import com.viks.demo.workWithXML.DOMWorker;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import javax.jws.WebService;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@WebService(endpointInterface = "com.viks.demo.mySOAPService.GetDocument")
@Component
public class GetDocumentImpl implements GetDocument {

    @Value("${myServiceAddress}")
    public String myServiceAddress;

    @Autowired
    DOMWorker domWorker;

    @Value("${login}")
    String user;

    @Value("${password}")
    String password;

    @Value(value = "${soapServiceUrl}")
    String soapServiceUrl;


    @Override
    public String getDocumentInfo(String identifier) throws SAXException, IOException {


        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(NewXds.class);
        factoryBean.setAddress(soapServiceUrl);

        factoryBean.setUsername(user);
        factoryBean.setPassword(password);

        ObjectFactory objectFactory = new ObjectFactory();
        GetDocumentRequest request = objectFactory.createGetDocumentRequest();
        request.setUniqueId(identifier);
        NewXds erSOAPService = (NewXds) factoryBean.create();

        GetDocumentResponse result = erSOAPService.getDocument(request);
        String errCode = result.getError().getErrorCode();
        switch (errCode){
            case "5": return String.format("Документ с uniqueId:%s  не найден", identifier);
            case "1": return "Необходимо использовать авторизацию";
            case "2": return "неверный логин/пароль";
            default: break;
        }
        Base64.Decoder dec = Base64.getDecoder();
        byte[] decbytes = dec.decode(result.getContent().getBytes(StandardCharsets.UTF_8));

        String patientSurname = domWorker.lookingForDocumentAtributes("patient.name.family", decbytes);
        String code = domWorker.lookingForDocumentAtributes("code", decbytes);

        return String.format("Тип документа: %s \n Фамилия пациента: %s \n", code, patientSurname);
    }
    public GetDocumentImpl() {
    }
}
