package org.season.ymir.example.server;


import org.season.ymir.common.TestService;
import org.season.ymir.core.annotation.YmirService;

/**
 * TODO
 *
 * @author KevinClair
 */
@YmirService
public class TestServiceImpl implements TestService {
    @Override
    public String test(String name) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello "+name;
    }
}
