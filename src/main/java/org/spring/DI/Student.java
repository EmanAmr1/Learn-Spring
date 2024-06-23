package org.spring.DI;

public class Student {

    private  Learn learning;
    private int id;
    private String StudentName;


    public void displayStudentInfo(){
        System.out.println("Student name is : "+ StudentName +" and id "+id );
    }
    public void myLearn(){
        learning.learn();
    }



    public Student() {

    }

    public Student(int id, String studentName) {
        this.id = id;
        StudentName = studentName;
    }


    public void setLearning(Learn learning) {
        this.learning = learning;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setStudentName(String studentName) {
        StudentName = studentName;
    }




}
