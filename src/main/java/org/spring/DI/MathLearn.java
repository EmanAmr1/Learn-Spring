package org.spring.DI;

public class MathLearn implements Learn{

    public void MathLearn(){

        System.out.println("math constructor called");
    }

    public void math(){
        System.out.println("i learn math");
    }

    @Override
    public void learn() {
        System.out.println("math learning");
    }
}
