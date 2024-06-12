package org.spring.DI;

public class Student {

   private String StudentName;

    public void displayStudentInfo(){
        System.out.println("Student name is : "+ StudentName);

    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
}
