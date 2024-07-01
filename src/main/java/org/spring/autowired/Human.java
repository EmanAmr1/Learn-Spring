package org.spring.autowired;

public class Human {

    private Heart heart;


    public Human(Heart heart) {
        this.heart = heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
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
