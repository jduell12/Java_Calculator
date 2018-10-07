package calculator;
import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{

	public Calculator (){
	//title of JFrame 
	super("calculator");	
	
	//sets initial size of JFrame 
	setSize(500, 400);
	
	//sets layout to a BorderLayout 
	setLayout(new BorderLayout());
	
	//adds buttons to layout to form the calculator 
	
	// closes on exiting
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	//sets the JFrame visible 
	setVisible(true);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();


	}
}