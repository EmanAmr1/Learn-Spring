package org.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {

    public static void main(String[] args){
     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
     System.out.println("CONFIG LOADED");
    // Airtel air =(Airtel) context.getBean("airtel");

     Airtel air =context.getBean("airtel",Airtel.class);
     air.calling();
     air.data();
    }
}
