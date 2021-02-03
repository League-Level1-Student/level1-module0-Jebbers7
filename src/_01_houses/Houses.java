package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		
		Robot rob = new Robot();
		rob.moveTo(50,500);
		rob.penDown();
		rob.setSpeed(50);
		rob.move(100);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(100);
		rob.setPenColor(0,255,0);
		rob.turn(270);
		rob.move(20);
		
	}
}
