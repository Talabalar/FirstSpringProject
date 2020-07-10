package com.main.src;


import com.main.src.acer.AcerHand;
import com.main.src.robots.FirstRobot;
import com.main.src.toshiba.ToshibaFoot;
import com.main.src.toshiba.ToshibaHand;
import com.main.src.toshiba.ToshibaHead;

public class Start {
    public static void main(String[] args) {
        ToshibaHead toshibaHead=new ToshibaHead();
        AcerHand acerHand=new AcerHand();
        ToshibaFoot toshibaFoot=new ToshibaFoot();
        FirstRobot firstRobot=new FirstRobot(toshibaHead,acerHand,toshibaFoot);
        firstRobot.action();
    }
}
