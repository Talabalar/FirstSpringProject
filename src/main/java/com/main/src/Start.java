package com.main.src;


import com.main.src.interfaces.Robot;
import com.main.src.robots.MT1000;
import com.main.src.robots.T1000Conveyr;
import com.main.src.robots.T1000Pool;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Context.xml");
        T1000Pool t1000Pool=(T1000Pool) applicationContext.getBean("t1000pool");
        t1000Pool.action();

    }
}
