package com.github.curriculeon;

import com.github.curriculeon.Interfaces.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void inheritenceTest(){
        //Given
        Instructor instructor = new Instructor(1L, "Joe");


        //Then
        Assert.assertTrue(instructor instanceof Person);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testTeach(){
        //Given
        Instructor instructor = new Instructor(1L, "Joe");
        Student student = new Student(2L, "Bob");
        Double expected = 4.0;

        //When
        instructor.teach(student, 4.0);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture(){
        //Given
        Instructor instructor = new Instructor(1L, "Joe");
        Student student = new Student(2L, "Bob");
        Student student2 = new Student(3L, "Zee");
        Student student3 = new Student(4L, "Tom");
        Student[] students = new Student[]{student, student2, student3};
        Double expected = 3.0;

        //When
        instructor.lecture(students, 9);
        Double actual = students[1].getTotalStudyTime();
        Double actual2 = students[0].getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual2);



    }

}
