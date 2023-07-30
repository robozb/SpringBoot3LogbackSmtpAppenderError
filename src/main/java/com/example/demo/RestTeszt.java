/*
 *  Bela Roboz - WEBFocus
 *  info@webfocus.hu
 */
package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Beci
 */
@RestController
@RequestMapping("/teszt")
public class RestTeszt {
    
    Logger logger = LoggerFactory.getLogger(RestTeszt.class);
    
    @GetMapping
    public String getOne(
    ) throws Throwable {
        logger.error("TESZT_");
        
//        EMail e=new EMail();
//        e.setCimzett("info@webfocus.hu");
//        e.setFelado("info@webfocus.hu");
//        e.setTargy("Teszt");
//        e.setTartalomAsNormalTipus("Teszt: "+new Date().toString());
//        e.kezbesites();
        return "alma1";
    }      
}
