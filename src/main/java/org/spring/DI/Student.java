package org.spring.DI;

public class Student {


    private  MathLearn mathLearn;
    private int id;
    private String StudentName;


    public Student() {

    }

    public Student(int id, String studentName) {
        this.id = id;
        StudentName = studentName;
    }

    public void displayStudentInfo(){
        System.out.println("Student name is : "+ StudentName +" and id "+id );

    }

    public void math(){
        mathLearn.MathLearn();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public MathLearn getMathLearn() {
        return mathLearn;
    }

    public void setMathLearn(MathLearn mathLearn) {
        this.mathLearn = mathLearn;
    }
}
