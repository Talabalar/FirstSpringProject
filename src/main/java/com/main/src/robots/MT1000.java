package com.main.src.robots;

import com.main.src.interfaces.Foot;
import com.main.src.interfaces.Hand;
import com.main.src.interfaces.Head;


public class MT1000  {
    private Head head;
    private Hand hand;
    private Foot foot;

    public MT1000(){

    }
    public MT1000(Head head,Hand hand,Foot foot){
        this.head=head;
        this.hand=hand;
        this.foot=foot;
    }

    public void action(){
        head.thinkSmth();
        hand.catchSmth();
        foot.runFast();
    }

    public void dance(){
        System.out.println("Robot T1000 is dancing");
    }

}
