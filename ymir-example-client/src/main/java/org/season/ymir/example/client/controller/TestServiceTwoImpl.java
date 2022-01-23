package org.season.ymir.example.client.controller;

import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author KevinClair
 **/
@Service("222")
public class TestServiceTwoImpl extends AbstractTestService{
    
    @Override
    protected String doTest() {
        return "222";
    }
}
