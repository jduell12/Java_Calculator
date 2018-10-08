package calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, plus, minus, multiplication, division, equals, clear;
	JTextField line;
	
	public Calculator (){
	//title of JFrame 
	super("calculator");	
	
	//sets initial size of JFrame 
	setSize(500, 400);
	
	//sets layout to a BorderLayout In the CENTER, create a gridLayout for the buttons.
	setLayout(new BorderLayout());
	
	//Mac code to restore normal JFrame look
	try {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		        } catch (Exception e) {
		            e.printStackTrace();
		}
	
	//add JTextField in North that is read only
	line = new JTextField(40);
	line.setBackground(Color.YELLOW);
	line.setEditable(false);
	line.setFont(new Font("SERIF", Font.BOLD, 32));
	add(line, BorderLayout.NORTH);
	
	// add gridLayout in the center for the buttons
	JPanel centerPanel = new JPanel();
	centerPanel.setLayout(new GridLayout(4, 4));
	add(centerPanel, BorderLayout.CENTER);
	
	//Number buttons for calculator 
	b0 = new JButton("0");
	b0.setBackground(Color.CYAN);
	b0.setFont(new Font("SERIF", Font.BOLD, 32));
	centerPanel.add(b0);
	b0.addActionListener(this);
	
	b1 = new JButton("1");
	b1.setBackground(Color.CYAN);
	b1.setFont(new Font("SERIF", Font.BOLD, 32));
	b1.addActionListener(this);
	centerPanel.add(b1);
	
	b2 = new JButton("2");
	b2.setBackground(Color.CYAN);
	b2.setFont(new Font("SERIF", Font.BOLD, 32));
	b2.addActionListener(this);
	centerPanel.add(b2);
	
	b3 = new JButton("3");
	b3.setBackground(Color.CYAN);
	b3.setFont(new Font("SERIF", Font.BOLD, 32));
	b3.addActionListener(this);
	centerPanel.add(b3);
	
	b4 = new JButton("4");
	b4.setBackground(Color.CYAN);
	b4.setFont(new Font("SERIF", Font.BOLD, 32));
	b4.addActionListener(this);
	centerPanel.add(b4);
	
	b5 = new JButton("5");
	b5.setBackground(Color.CYAN);
	b5.setFont(new Font("SERIF", Font.BOLD, 32));
	b5.addActionListener(this);
	centerPanel.add(b5);
	
	b6 = new JButton("6");
	b6.setBackground(Color.CYAN);
	b6.setFont(new Font("SERIF", Font.BOLD, 32));
	b6.addActionListener(this);
	centerPanel.add(b6);
	
	b7 = new JButton("7");
	b7.setBackground(Color.CYAN);
	b7.setFont(new Font("SERIF", Font.BOLD, 32));
	b7.addActionListener(this);
	centerPanel.add(b7);
	
	b8 = new JButton("8");
	b8.setBackground(Color.CYAN);
	b8.setFont(new Font("SERIF", Font.BOLD, 32));
	b8.addActionListener(this);
	centerPanel.add(b8);
	
	b9= new JButton("9");
	b9.setBackground(Color.CYAN);
	b9.setFont(new Font("SERIF", Font.BOLD, 32));
	b9.addActionListener(this);
	centerPanel.add(b9);
	
	//Computational buttons 
	plus = new JButton("+");
	plus.setBackground(Color.RED);
	plus.setFont(new Font("SERIF", Font.BOLD, 32));
	plus.addActionListener(this);
	centerPanel.add(plus);
	
	minus = new JButton("-");
	minus.setBackground(Color.RED);
	minus.setFont(new Font("SERIF", Font.BOLD, 32));
	minus.addActionListener(this);
	centerPanel.add(minus);
	
	multiplication = new JButton("*");
	multiplication.setBackground(Color.RED);
	multiplication.setFont(new Font("SERIF", Font.BOLD, 32));
	multiplication.addActionListener(this);
	centerPanel.add(multiplication);
	
	division = new JButton("/");
	division.setBackground(Color.RED);
	division.setFont(new Font("SERIF", Font.BOLD, 32));
	division.addActionListener(this);
	centerPanel.add(division);
	
	equals = new JButton("=");
	equals.setBackground(Color.RED);
	equals.setFont(new Font("SERIF", Font.BOLD, 32));
	equals.addActionListener(this);
	centerPanel.add(equals);
	
	clear = new JButton("clear");
	clear.setBackground(Color.RED);
	clear.setFont(new Font("SERIF", Font.BOLD, 32));
	clear.addActionListener(this);
	centerPanel.add(clear);
	
	
	// closes on exiting
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	//sets the JFrame visible 
	setVisible(true);
	}
	
	//adds action performed 
	public void actionPerformed(ActionEvent e) {
			String textField = line.getText();
			Object source = e.getSource();
			String text = "";
			
			if (source == b0) {
				text = textField + "0";
			} else if (source == b1) {
				text = textField + "1";
			} else if (source == b2) {
				text = textField + "2";
			} else if (source == b3) {
				text = textField + "3";
			} else if (source == b4) {
				text = textField + "4";
			} else if (source == b5) {
				text = textField + "5";
			} else if (source == b6) {
				text = textField + "6";
			} else if (source == b7) {
				text = textField + "7";
			} else if (source == b8) {
				text = textField + "8";
			} else if (source == b9) {
				text = textField + "9";
			}
			
			line.setText(text);
	}
	
	
	public static void main(String[] args) {
		Calculator c = new Calculator();


	}
}