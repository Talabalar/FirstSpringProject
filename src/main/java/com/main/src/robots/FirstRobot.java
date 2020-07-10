package com.main.src.robots;

import com.main.src.interfaces.Foot;
import com.main.src.interfaces.Hand;
import com.main.src.interfaces.Head;

public class FirstRobot {
    protected Head head;
    protected Hand hand;
    protected Foot foot;

    public FirstRobot(){

    }
    public FirstRobot(Head head,Hand hand,Foot foot){
        this.head=head;
        this.hand=hand;
        this.foot=foot;
    }

    public void action(){
        head.thinkSmth();
        hand.catchSmth();
        foot.runFast();
    }
}
