package org.spring.college;

public class ArabicTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Arabic Teacher");
        System.out.println("Teacher name is :ola");
    }
}
