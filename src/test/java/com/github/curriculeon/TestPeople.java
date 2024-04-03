package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {


    @Test
    public void addTest(){
        //Given
        Person person1 = new Person(1L, "Bob");
        Person person2 = new Person(2L, "Joy");
        People people = new People();
        Integer expected = 2;

        //When
        people.add(person1);
        people.add(person2);
        Integer actual = people.count();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest(){
        //Given
        Person person1 = new Person(1L, "Bob");
        People people = new People();
        people.add(person1);
        Integer expected = 0;

        //When
        people.remove(person1);
        Integer actual = people.count();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdTest(){
        //Given
        Person person1 = new Person(1L, "Bob");
        People people = new People();
        people.add(person1);
        Long personId = person1.getId();

        //When
        Person actual = people.findById(personId);

        //Then
        Assert.assertEquals(person1, actual);


    }
}
