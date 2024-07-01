package org.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Heart heart;


    public Human() {
    }


    public Human(Heart heart) {
        this.heart = heart;
        System.out.println("human constructor is getting called");
    }

    @Autowired
    @Qualifier("heartObj2")
    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("human setter is getting called");
    }

    public Heart getHeart() {
        return heart;
    }

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
