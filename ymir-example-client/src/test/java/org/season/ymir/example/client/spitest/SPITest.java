package org.season.ymir.example.client.spitest;

import org.junit.jupiter.api.Test;
import org.season.ymir.common.utils.GsonUtils;
import org.season.ymir.spi.loader.ExtensionLoader;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * TODO
 *
 * @author KevinClair
 **/
public class SPITest {

    @Test
    public void test(){
        System.out.println(ExtensionLoader.getExtensionLoader(TestInterface.class).getLoader("test2").test());

        System.out.println(ExtensionLoader.getExtensionLoader(TestInterface.class).getLoader("test1").test());

        System.out.println(ExtensionLoader.getExtensionLoader(TestInterface.class).getLoader("test2").test());

        System.out.println(ExtensionLoader.getExtensionLoader(TestTestInterface.class).getLoader("test1").test());
    }

    @Test
    public void test1(){
        List<Integer> integers = Arrays.asList(1, 1, 1, 1, 0);
        HashSet<Integer> integers1 = new HashSet<>(integers);
        System.out.println(GsonUtils.getInstance().toJson(integers1));
    }
}
