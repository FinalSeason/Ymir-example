package org.season.ymir.example;

/**
 * TODO
 *
 * @author KevinClair
 **/
public abstract class AbstractTestService implements TestInterface{

    @Override
    public String test() {
        return doTest();
    }

    protected abstract String doTest();
}
