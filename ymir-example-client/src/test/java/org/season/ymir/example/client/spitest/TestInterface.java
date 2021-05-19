package org.season.ymir.example.client.spitest;

import org.season.ymir.spi.annodation.SPI;

/**
 * TODO
 *
 * @author KevinClair
 **/
@SPI("test1")
public interface TestInterface {

    String test();
}
