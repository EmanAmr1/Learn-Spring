package org.spring.School;

import jdk.jfr.Frequency;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {


    @Value("${student.name}")
    private String name;

    @Value("${student.insertedCourse}")
    private String insertedCourse;

    @Value("${student.hobby}")
    private String hobby;



    public void displayStudentInfo(){
        System.out.println("name is:" +name+" inserted course: " + insertedCourse +" hobby:" +hobby);
    }

    
}
