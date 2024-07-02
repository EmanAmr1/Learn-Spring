package org.spring.college;

import org.springframework.stereotype.Component;

@Component
public class ArabicTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Arabic Teacher");
        System.out.println("Teacher name is :ola");
    }
}
