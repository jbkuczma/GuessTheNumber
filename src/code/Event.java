package code;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class Event implements ActionListener{

	private JButton _button;
	private static int _randomNumber;

	/**
	 * Constructor
	 * @param button
	 */
	public Event(JButton button){
		_button = button;
		_randomNumber = randomNumber();
	}
	/**
	 * Generates random number
	 * @return
	 */
	public int randomNumber(){
		Random r = new Random();
		int randomNumber = r.nextInt((100 - 1) + 1) + 1; // ((max-min)+1)+min
		return randomNumber;
	}
	/**
	 * Returns the number value of the button that is pressed
	 * @return
	 */
	public int getNumber(){
		return Integer.parseInt(_button.getText());
	}
	/**
	 * If the guessed number is larger than the random number, the button turns blue. If the guessed number is less than
	 * the random number, the button turns green. If the random number is correctly guessed, the button turns yellow.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		UI ui = new UI();
		int guessed = getNumber();
		if(guessed > _randomNumber){
			_button.setBackground(Color.BLUE);
			_button.setOpaque(true);
		}
		if(guessed < _randomNumber){
			_button.setBackground(Color.GREEN);
			_button.setOpaque(true);
		}
		guessed = getNumber();
		if(guessed == _randomNumber){
			_button.setBackground(Color.YELLOW);
			_button.setOpaque(true);
		}
	}
}
