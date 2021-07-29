package org.season.ymir.example;

import org.junit.jupiter.api.Test;
import org.season.ymir.common.exception.RpcException;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author KevinClair
 **/
public class TestCase {

    @Test
    public void test(){

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        String s = list.stream().filter(each -> each.equals("3")).findFirst().orElseThrow(() -> new RpcException("1111111"));
        System.out.println("111");
    }
}
