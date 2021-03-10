package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Button");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		System.out.println("Button Clicked");
		Random ran = new Random();
		int num = ran.nextInt(5);
		if(num == 0) {
			JOptionPane.showMessageDialog(null, "A dubious friend may be an enemy in camouflage");
		}
		else if(num == 1) {
			JOptionPane.showMessageDialog(null, "A fresh start will put you on your way");
		}
		else if(num == 2) {
			JOptionPane.showMessageDialog(null, "A golden egg of opportunity falls into your lap this month");
		}
		else if(num == 3) {
			JOptionPane.showMessageDialog(null, "A lifetime friend shall soon be made");
		}
		else {
			JOptionPane.showMessageDialog(null, "All the effort you are making will ultimately pay off");
		}
	}
}