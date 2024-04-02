package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {


    @Test
    public void inheritenceTest(){
        //Given
        Student student = new Student(1L, "Joy");

        //Then
        Assert.assertTrue(student instanceof Person);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void learnTest(){
        //Given
        Student student = new Student(1L, "Joy");
        Double expectedDouble = 4.0;

        //When
        student.learn(4.0);
        Double actualDouble = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedDouble, actualDouble);

    }



}
