package org.season.ymir.example.client.controller;

import org.season.ymir.common.TestResponse;
import org.season.ymir.common.TestService;
import org.season.ymir.core.annotation.Reference;
import org.season.ymir.core.context.RpcContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * TODO
 *
 * @author KevinClair
 **/
@RestController
public class TestController {

    @Reference(check = true, timeout = 20000)
    private TestService testService;

    @Autowired
    private Map<String, TestInterface> maps;

    @PostMapping("/name")
    public TestResponse get(@RequestBody TestResponse name){
        RpcContext.getContext().setAttachments(name.getName(), name.getAge()+"");
        return testService.test(name);
    }

    @PostMapping("/test")
    public String test(@RequestParam("name") String name){
        return maps.get(name).test();
    }
}
