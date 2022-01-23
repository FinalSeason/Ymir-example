package org.season.ymir.example.client.controller;

import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author KevinClair
 **/
@Service("111")
public class TestServiceImpl extends AbstractTestService{

    @Override
    protected String doTest() {
        return "111";
    }
}
