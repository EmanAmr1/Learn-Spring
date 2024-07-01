package org.spring.School;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getInsertedCourse() {
        return insertedCourse;
    }

    public void setInsertedCourse(String insertedCourse) {
        this.insertedCourse = insertedCourse;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
