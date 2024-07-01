package org.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

    private Heart heart;


    public Human() {
    }

   
    public Human(Heart heart) {
        this.heart = heart;
        System.out.println("human constructor is getting called");
    }

    @Autowired
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
        }
        else {
            System.out.println("you dead");
        }
    }


}
