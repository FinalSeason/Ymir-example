package org.season.ymir.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author KevinClair
 **/
@RestController

public class TestController {

    @Value("${test.key}")
    private String name;

    @RequestMapping("/test")
    public String getProperty(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
