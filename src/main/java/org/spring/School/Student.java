package org.spring.School;

import jdk.jfr.Frequency;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {



    private String name;
    private String insertedCourse;
    private String hobby;



    public void displayStudentInfo(){
        System.out.println("name is:" +name+" inserted course: " + insertedCourse +" hobby:" +hobby);
    }






    public String getName() {
        return name;
    }

    @Value("${student.name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getInsertedCourse() {
        return insertedCourse;
    }

    @Value("${student.insertedCourse}")
    public void setInsertedCourse(String insertedCourse) {
        this.insertedCourse = insertedCourse;
    }

    public String getHobby() {
        return hobby;
    }

    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
