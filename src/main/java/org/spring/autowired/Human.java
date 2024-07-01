package org.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    @Autowired
    @Qualifier("heartObj2")
    private Heart heart;


 

    public void startPumping(){
        if (heart!=null){
        heart.pump();
            System.out.println("name is :"+heart.getName() +" and number is: "+heart.getNoOfHeart());
        }
        else {
            System.out.println("you dead");
        }
    }


}
