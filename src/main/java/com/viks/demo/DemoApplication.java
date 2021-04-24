package com.viks.demo;

import com.viks.demo.mySOAPService.GetDocumentImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args){

        SpringApplication.run(DemoApplication.class, args);

        Endpoint.publish("http://localhost:9091/ws/check?wsdl", new GetDocumentImpl());




    }

}

