package com.viks.demo.mySOAPService;

import com.viks.demo.generatedSrcFromWSDL.GetDocumentRequest;
import com.viks.demo.generatedSrcFromWSDL.GetDocumentResponse;
import com.viks.demo.generatedSrcFromWSDL.NewXds;
import com.viks.demo.generatedSrcFromWSDL.ObjectFactory;
import com.viks.demo.workWithXML.DOMWorker;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.xml.sax.SAXException;

import javax.jws.WebService;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

@WebService(endpointInterface = "com.viks.demo.mySOAPService.GetDocument")
public class GetDocumentImpl implements GetDocument {

   // @Value("test")
    String user = "test";

   // @Value("test")
    String password = "test";

    @Override
    public String getDocumentInfo(String identifier) throws ParserConfigurationException, SAXException, IOException {


        String soapServiceUrl = "https://test-med.yarcloud.ru/newxds-external/ws/service";

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(NewXds.class);
        factoryBean.setAddress(soapServiceUrl);

        factoryBean.setUsername(user);
        factoryBean.setPassword(password);

        ObjectFactory objectFactory = new ObjectFactory();
        GetDocumentRequest request = objectFactory.createGetDocumentRequest();
        request.setUniqueId(identifier);
        NewXds webserviceSEI = (NewXds) factoryBean.create();

        GetDocumentResponse result = webserviceSEI.getDocument(request);
        String errCode = result.getError().getErrorCode();
        switch (errCode){
            case "5": return String.format("Документ с uniqueId:%s  не найден", identifier);
            case "1": return "Необходимо использовать авторизацию";
            case "2": return "неверный логин/пароль";
            default: break;
        }
        Base64.Decoder dec = Base64.getDecoder();
        byte[] decbytes = dec.decode(result.getContent().getBytes());
        String sOut = new String(decbytes);

        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("out.xml"));
            out.write(sOut);
        } catch (IOException e) {
            throw new RuntimeException(e); //этот песец надо убирать!
        } finally {
            if (out != null) {
                try { out.close(); } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
            DOMWorker domWorker = new DOMWorker(new File("out.xml"));
            String patientSurname = domWorker.lookingForDocumentAtributes("patient.name.family");
            String code = domWorker.lookingForDocumentAtributes("code");

        return String.format("Тип документа: %s \n Фамилия пациента: %s \n", code, patientSurname);}

}
