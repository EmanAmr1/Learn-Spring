package org.spring.college;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MathTeacher")
public class MathTeacher implements Teacher{


    @Override
    public void teach() {
        System.out.println("Math Teacher");
        System.out.println("Teacher name is :ahmed");
    }
}
