package org.spring.college;

import org.spring.School.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeMain {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(CollegeConfig.class);
        College c =context.getBean("colBean",College.class);
        System.out.println("the college object created by spring is:" +c);
        c.test();
    }
}
