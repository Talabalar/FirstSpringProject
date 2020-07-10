package com.main.src;


import com.main.src.robots.MT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Context.xml");
        MT1000 mt1000=(MT1000)applicationContext.getBean("T1000");
        mt1000.action();
        mt1000.dance();
    }
}
