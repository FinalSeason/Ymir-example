package org.season.ymir.example.client.controller;

import org.season.ymir.common.TestService;
import org.season.ymir.core.annotation.YmirReference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author KevinClair
 **/
@RestController
public class TestController {

    @YmirReference
    private TestService service;

    @PostMapping("/name")
    public String get(@RequestParam("name") String name){
        return service.test(name);
    }
}
