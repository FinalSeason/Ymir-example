package org.season.ymir.example.client.controller;

/**
 * TODO
 *
 * @author KevinClair
 **/
public abstract class AbstractTestService implements TestInterface {

    @Override
    public String test() {
        return doTest();
    }

    protected abstract String doTest();
}
