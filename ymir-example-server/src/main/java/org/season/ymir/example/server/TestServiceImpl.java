package org.season.ymir.example.server;


import org.season.ymir.client.annotation.YmirService;
import org.season.ymir.common.TestService;

/**
 * TODO
 *
 * @author KevinClair
 */
@YmirService
public class TestServiceImpl implements TestService {
    @Override
    public String test(String name) {
        return "Hello "+name;
    }
}
