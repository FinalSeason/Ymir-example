package org.season.ymir.example;

import org.season.ymir.client.annotation.YmirService;

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
