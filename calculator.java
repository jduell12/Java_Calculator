package calculator;
import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{

	public Calculator (){
	//title of JFrame 
	super("calculator");	
	
	//sets initial size of JFrame 
	setSize(500, 400);
	
	//sets layout to a BorderLayout In the CENTER, create a gridLayout for the buttons.
	setLayout(new BorderLayout());
	
	//add JTextField in North
	JTextField line = new JTextField(40);
	line.setBackground(Color.YELLOW);
	add(line, BorderLayout.NORTH);
	
	// add gridLayout in the center for the buttons
	JPanel centerPanel = new JPanel();
	centerPanel.setLayout(new GridLayout(4, 4));
	add(centerPanel, BorderLayout.CENTER);
	
	//Number buttons for calculator 
	JButton b0 = new JButton("0");
	b0.setBackground(Color.CYAN);
	centerPanel.add(b0);
	
	JButton b1 = new JButton("1");
	b1.setBackground(Color.CYAN);
	centerPanel.add(b1);
	
	JButton b2 = new JButton("2");
	b2.setBackground(Color.CYAN);
	centerPanel.add(b2);
	
	JButton b3 = new JButton("3");
	b3.setBackground(Color.CYAN);
	centerPanel.add(b3);
	
	JButton b4 = new JButton("4");
	b4.setBackground(Color.CYAN);
	centerPanel.add(b4);
	
	JButton b5 = new JButton("5");
	b5.setBackground(Color.CYAN);
	centerPanel.add(b5);
	
	JButton b6 = new JButton("6");
	b6.setBackground(Color.CYAN);
	centerPanel.add(b6);
	
	JButton b7 = new JButton("7");
	b7.setBackground(Color.CYAN);
	centerPanel.add(b7);
	
	JButton b8 = new JButton("8");
	b8.setBackground(Color.CYAN);
	centerPanel.add(b8);
	
	JButton b9= new JButton("9");
	b9.setBackground(Color.CYAN);
	centerPanel.add(b9);
	
	//Computational buttons 
	JButton plus = new JButton("+");
	plus.setBackground(Color.RED);
	centerPanel.add(plus);
	
	JButton minus = new JButton("-");
	minus.setBackground(Color.RED);
	centerPanel.add(minus);
	
	JButton multiplication = new JButton("*");
	multiplication.setBackground(Color.RED);
	centerPanel.add(multiplication);
	
	JButton division = new JButton("/");
	division.setBackground(Color.RED);
	centerPanel.add(division);
	
	JButton equals = new JButton("=");
	equals.setBackground(Color.RED);
	centerPanel.add(equals);
	
	JButton clear = new JButton("clear");
	clear.setBackground(Color.RED);
	centerPanel.add(clear);
	
	
	// closes on exiting
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	//sets the JFrame visible 
	setVisible(true);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();


	}
}