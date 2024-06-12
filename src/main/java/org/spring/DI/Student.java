package org.spring.DI;

public class Student {


    private int id;

   private String StudentName;


    public Student(int id, String studentName) {
        this.id = id;
        StudentName = studentName;
    }

    public void displayStudentInfo(){
        System.out.println("Student name is : "+ StudentName +" and id "+id);

    }

  /*  public int getId() {
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
    }*/
}
