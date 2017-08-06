package com.supri.java;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {


    @Test
    public void testMarksForEvenRollNumber() {
        Student student = new Student("Supriya", 6);
        Assert.assertEquals(50, student.getTotalMarks());
    }

    @Test
    public void testMarksForOddRollNumber() {
        Student student = new Student("Srinath", 5);
        Assert.assertEquals(100, student.getTotalMarks());
    }

}
