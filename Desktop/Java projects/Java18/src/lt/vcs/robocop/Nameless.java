package lt.vcs.robocop;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

import java.awt.*;

public class Nameless extends Robot {


    @Override
    public void run() {
        while(true){
            ahead(100);
            turnGunRight(360);
            back(75);
            turnGunRight(360);

        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double distance = e.getDistance();
        if(distance > 800)
            fire(5);
        else if(distance > 600 && distance <= 800)
            fire(4);
        else if(distance > 400 && distance <= 600)
            fire(3);
        else if(distance > 200 && distance <= 400)
            fire(2);
        else if(distance < 200)
            fire(1);
    }
}




