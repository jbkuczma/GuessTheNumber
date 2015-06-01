package code;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UI {

	/**
	 * Creates the UI for the game. Adds 100 buttons with values from 1 to 100.
	 */
	public UI(){
		JFrame jf = new JFrame("Try to guess the number correctly!");
		jf.setSize(1200,600);
		JPanel jp = new JPanel();
		JLabel jl = new JLabel("Blue = too high...Green = too low...Yellow = correct");
		jp.setBackground(Color.RED);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jp.add(jl);
		jf.add(jp);
		for(int i = 1; i < 101; i++){
			JButton jb = new JButton();
			jb.setText(""+i);
			jb.addActionListener(new Event(jb));
			jp.add(jb);
		}
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		UI ui = new UI();	
	}
}
