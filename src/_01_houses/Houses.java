package _01_houses;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.awt.color.*;
import java.util.Random;

public class Houses {
	Robot rob = new Robot();

	public void run() {
		rob.setWindowColor(Color.black);
		rob.moveTo(50, 500);
		rob.penDown();
		rob.setSpeed(50);
		Random ran = new Random();
		for (int i = 0; i < 9; i++) {
			int num = ran.nextInt(3);
			if (num == 0) {
				drawHouse("small", "green");
			} else if (num == 1) {
				drawHouse("medium", "blue");
			} else {
				drawHouse("large", "red");
			}
		}
	}

	void drawHouse(String height, String color) {

		if (color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		} else if (color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		} else if (color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		}
		int size = 0;
		if (height.equalsIgnoreCase("small")) {
			size = 60;
		} else if (height.equalsIgnoreCase("medium")) {
			size = 120;
		} else if (height.equalsIgnoreCase("large")) {
			size = 250;
		}
		rob.move(size);
		if(size == 250) {
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		}
		else {
			drawPointyRoof();
		}
		rob.move(size);
		rob.setPenColor(0, 255, 0);
		rob.turn(270);
		rob.move(20);
		rob.setPenColor(0, 0, 0);
		rob.turn(270);	
	}
	void drawPointyRoof() {
		rob.turn(45);
		rob.move(10);
		rob.turn(90);
		rob.move(10);
		rob.turn(45);
	}
}
