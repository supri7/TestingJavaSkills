package com.supri;

import java.util.Date;

public class Student {

    private String name;
    private long rollNumber;

    public Student(String name, long rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }


    public String getName() {
        return name;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public int getTotalMarks() {
        if(rollNumber%2==0) {
            System.out.println("It is a even number");
            return 50;
        }
        else {
            System.out.println("It is a odd number");
            return 100;
        }
    }
}
