package com.dongxie.gvboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GvbootApplication {

    public static void main(String[] args) {
        new SpringApplication(GvbootApplication.class).run(args);
    }

    @RequestMapping(value = "/api/hello", method = RequestMethod.GET)
    public String hello (){
        return "hello from gvboot by dongxie";
    }
}
