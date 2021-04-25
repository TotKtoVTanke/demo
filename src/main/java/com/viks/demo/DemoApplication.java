package com.viks.demo;

import com.viks.demo.mySOAPService.GetDocumentImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import javax.xml.ws.Endpoint;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args){

        ConfigurableApplicationContext cac = SpringApplication.run(DemoApplication.class, args);

        GetDocumentImpl getDocument = cac.getBean(GetDocumentImpl.class);

        Endpoint.publish(getDocument.myServiceAddress, getDocument);




    }

}

