package org.spring.School;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans file is loaded ");
        Student s=context.getBean("school",Student.class);
        s.displayStudentInfo();
    }
}
