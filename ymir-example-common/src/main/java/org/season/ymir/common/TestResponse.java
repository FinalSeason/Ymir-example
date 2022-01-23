package org.season.ymir.common;

import java.io.Serializable;

/**
 * TODO
 *
 * @author KevinClair
 **/
public class TestResponse implements Serializable {

    private String name;

    private int age;

    public TestResponse(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the value of name.
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets the value of age.
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age.
     *
     * @param age age
     */
    public void setAge(final int age) {
        this.age = age;
    }
}
