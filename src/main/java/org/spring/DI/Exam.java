package org.spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

       Student s= context.getBean("student",Student.class);
      // s.setStudentName("eman");
       s.displayStudentInfo();
       s.math();
       // Student s2= context.getBean("student2",Student.class);
       //s2.displayStudentInfo();
    }

}
