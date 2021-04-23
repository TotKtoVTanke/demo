package om.viks.demo;

import om.viks.demo.generatedSrcFromWSDL.*;
import om.viks.demo.mySOAPService.GetDocumentImpl;
import om.viks.demo.workWithXML.DOMWorker;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;

import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Base64;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        SpringApplication.run(DemoApplication.class, args);
        Endpoint.publish("http://localhost:9096/ws/check", new GetDocumentImpl());

        testSOAPFromClient();



    }

    private static void testSOAPFromClient() throws IOException, SAXException, ParserConfigurationException {
        String soapServiceUrl = "https://test-med.yarcloud.ru/newxds-external/ws/service";

       /* JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(NewXds.class);
        factoryBean.setAddress(soapServiceUrl);
        factoryBean.setUsername("test");
        factoryBean.setPassword("test");

        ObjectFactory objectFactory = new ObjectFactory();
        GetDocumentRequest request = objectFactory.createGetDocumentRequest();
        request.setUniqueId("123");
        NewXds webserviceSEI = (NewXds) factoryBean.create();

        GetDocumentResponse result = webserviceSEI.getDocument(request);
        System.out.println("Если есть ошибка");
        System.out.println(result.getError().getErrorCode());

        Base64.Decoder dec = Base64.getDecoder();
        byte[] decbytes = dec.decode(result.getContent().getBytes());
        String sOut = new String(decbytes);
        System.out.println(sOut);
        System.out.println("-----");

        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("out.xml"));
            out.write(sOut);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (out != null) {
                try { out.close(); } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
        DOMWorker domWorker = new DOMWorker(new File("out.xml"));
        domWorker.lookingForDocumentAtributes("patient.name.family");



    }


}

