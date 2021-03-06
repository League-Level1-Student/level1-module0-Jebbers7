package _05_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the recipe java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the recipe package(body_part_quiz), and change the names below.

	String arnold = "src/_05_body_part_quiz/arnold.jpeg";
	String jack = "src/_05_body_part_quiz/leonardo.jpeg";
	String leonardo = "src/_05_body_part_quiz/morgan.jpeg";
	String morgan = "src/_05_body_part_quiz/jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setSize(500, 500);
		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.resize(150,150);

		 
		showNextImage();
	}

	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		int score = 0;
		// 2. Set the size of the window in the initializeGui() method 
		
		// 4. Ask the user who this person is and store their answer
		String guess = JOptionPane.showInputDialog("Who is this?");

		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1
		if(guess.equalsIgnoreCase("arnold")) {
			System.out.println("Correct");
			score++;
		}
		else {
			System.out.println("Incorrect - The answer was arnold");
		}
		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is
		
		// 7. Use the showNextImage() method below to get the next image
		showNextImage();

		// 8. .... repeat 4-7 for all your images.....
		String guess2 = JOptionPane.showInputDialog("Who is this?");
		if(guess2.equalsIgnoreCase("jack")) {
			System.out.println("Correct");
			score++;
		}
		else {
			System.out.println("Incorrect - The answer was jack");
		}
		showNextImage();
		
		String guess3 = JOptionPane.showInputDialog("Who is this?");
		if(guess3.equalsIgnoreCase("leonardo")) {
			System.out.println("Correct");
			score++;
		}
		else {
			System.out.println("Incorrect - The answer was leonardo");
		}
		showNextImage();
		String guess4 = JOptionPane.showInputDialog("Who is this?");
		if(guess4.equalsIgnoreCase("morgan")) {
			System.out.println("Correct");
			score++;
		}
		else {
			System.out.println("Incorrect - The answer was morgan");
		}
		showNextImage();
		// 9. Show them their current score
		JOptionPane.showMessageDialog(null,"Your current score is " + score);
	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(arnold);
		imageList.add(imageLabel);
		imageLabel = loadImage(jack);
		imageList.add(imageLabel);
		imageLabel = loadImage(leonardo);
		imageList.add(imageLabel);
		imageLabel = loadImage(morgan);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
