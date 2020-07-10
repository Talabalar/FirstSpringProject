package com.main.src.robots;

import com.main.src.interfaces.Robot;
import com.main.src.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {

    Collection<Robot> robotCollection;

    public Collection<Robot> createRobotPool() {
        return robotCollection;
    }

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void action(){
        for (Robot robot:robotCollection)
            robot.action();
    }
}
