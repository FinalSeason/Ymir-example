package org.season.ymir.example.client.spitest;

import org.junit.jupiter.api.Test;
import org.season.ymir.spi.loader.ExtensionLoader;

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
}
