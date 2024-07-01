package org.spring.college;

import org.spring.School.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeMain {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans file is loaded ");
        College c =context.getBean("collegeClass",College.class);
       System.out.println("the college object created by spring is:" +c);
    }
}
