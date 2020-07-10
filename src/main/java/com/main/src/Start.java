package com.main.src;


import com.main.src.interfaces.Robot;
import com.main.src.robots.MT1000;
import com.main.src.robots.T1000Conveyr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Context.xml");
        T1000Conveyr t1000Conveyr=(T1000Conveyr)applicationContext.getBean("convyt1000");
        Robot termin1=t1000Conveyr.createRobot();
        Robot termin2=t1000Conveyr.createRobot();
        Robot termin3=t1000Conveyr.createRobot();
        System.out.println("Robot 1"+termin1);
        System.out.println("Robot 2"+termin2);
        System.out.println("Robot 3"+termin3);

    }
}
