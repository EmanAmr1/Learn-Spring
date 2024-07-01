package org.spring.college;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{


    @Override
    public void teach() {
        System.out.println("Math Teacher");
        System.out.println("Teacher name is :ahmed");
    }
}
