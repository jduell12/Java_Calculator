
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Calculator extends JFrame implements ActionListener {
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, plus, minus, multiplication, division, equals, clear;
	JTextField line;
	int operand1, operand2, sum;
	String operator = "";
	ArrayList<JButton> buttons = new ArrayList();
	
	public Calculator (){
	//title of JFrame 
	super("calculator");	
	
	//sets initial size of JFrame 
	setSize(500, 400);
	
	//sets layout to a BorderLayout In the CENTER.
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
	centerPanel.setLayout(new GridLayout(4, 4, 4, 4));
	add(centerPanel, BorderLayout.CENTER);
	
	//Added buttons for calculator 
	b0 = new JButton("0");
	b1 = new JButton("1");
	b2 = new JButton("2");
	b3 = new JButton("3");
	b4 = new JButton("4");
	b5 = new JButton("5");
	b6 = new JButton("6");
	b7 = new JButton("7");
	b8 = new JButton("8");
	b9= new JButton("9");
	plus = new JButton("+");
	minus = new JButton("-");
	multiplication = new JButton("*");
	division = new JButton("/");
	equals = new JButton("=");
	clear = new JButton("clear");
	
	buttons.add(b0);
	buttons.add(b1);
	buttons.add(b2);
	buttons.add(b3);
	buttons.add(b4);
	buttons.add(b5);
	buttons.add(b6);
	buttons.add(b7);
	buttons.add(b8);
	buttons.add(b9);
	buttons.add(plus);
	buttons.add(minus);
	buttons.add(multiplication);
	buttons.add(division);
	buttons.add(equals);
	buttons.add(clear);
	
	for (int i = 0; i < 10; i++) {
		buttons.get(i).setBackground(Color.CYAN);
		buttons.get(i).setFont(new Font("SERIF", Font.BOLD, 32));
		centerPanel.add(buttons.get(i));
		buttons.get(i).addActionListener(this);
	}
	
	for (int i = 10; i < buttons.size(); i++) {
		buttons.get(i).setBackground(Color.RED);
		buttons.get(i).setFont(new Font("SERIF", Font.BOLD, 32));
		buttons.get(i).addActionListener(this);
		centerPanel.add(buttons.get(i));
	}
	
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
			String num;

			
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
			} else if (source == plus) {
				num = line.getText();
				operand1 = Integer.parseInt(num);
				operator = "plus";
				line.setText("");
			} else if (source == minus) {
				num = line.getText();
				operand1 = Integer.parseInt(num);
				operator = "minus";
				line.setText("");
			} else if (source == multiplication) {
				num = line.getText();
				operand1 = Integer.parseInt(num);
				operator = "multiplication";
				line.setText("");
			} else if (source == division) {
				num = line.getText();
				operand1 = Integer.parseInt(num);
				operator = "division";
				line.setText("");
			} else if (source == equals) {
				num = line.getText();
				operand2 = Integer.parseInt(num);
				switch (operator) {
				case "plus":
					sum = operand1 + operand2;
					text = Integer.toString(sum);
					break;
				case "minus":
					sum = operand1 - operand2;
					text = Integer.toString(sum);
					break;
				case "multiplication":
					sum = (operand1 * operand2);
					text = Integer.toString(sum);
					break;
				case "division":
					sum = (operand1/operand2);
					text = Integer.toString(sum);
					break;
				}
				
				line.setText(text);
				
			} else {
				operand1 = 0;
				operand2 = 0;
				sum = 0;
				text = "";
			}
			
			line.setText(text);
	}
	
	
	public static void main(String[] args) {
		Calculator c = new Calculator();


	}
}
