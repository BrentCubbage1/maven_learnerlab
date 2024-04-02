package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testPersonConstructor(){
        //Given
        Person person = new Person(1L, "Bob");
        String expectedName = "Bob";
        Long expectedId = 1L;

        //When
        String actualName = person.getName();
        Long actualId = person.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName(){
        //Given
        Person person = new Person(1L, "Bob");
        String expectedName = "Pop";

        //When
        person.setName("Pop");
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

}
