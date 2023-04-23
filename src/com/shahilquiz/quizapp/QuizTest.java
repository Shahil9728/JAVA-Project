package com.shahilquiz.quizapp;
// Used for organising similar classes and interfaces

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Used for action handling like click edit text etc.

// Java Swing tutorial is a part of Java Foundation Classes (JFC) that is used to create window-based applications.
// These are the swing components.
// The ButtonGroup component manages the selected/unselected state for a set of buttons.
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class QuizTest extends JFrame implements ActionListener {
	
	JLabel label;
	JRadioButton radioButtons[] = new JRadioButton[5];
	JButton btnNext,btnResult;
	// Creating a set of buttons with the same ButtonGroup object means that turning "on" 
	// one of those buttons turns off all other buttons in the group
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[] = new int[10];
	
	// Parameterized constructor
	public QuizTest(String s)
	{
		// It is used to call superclass methods, and to access the superclass constructor.
		super(s);
		
		// It is for the question
		label = new JLabel();
		add(label);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			radioButtons[i] = new JRadioButton();
			add(radioButtons[i]);
			bg.add(radioButtons[i]);
		}
		btnNext = new JButton("Next");
		btnResult = new JButton("Result");
		btnResult.setVisible(false);
		btnResult.addActionListener(this);
		btnNext.addActionListener(this);
		
		// public void add is the method of the components 
		add(btnNext);
		add(btnResult);
		
		setData();
		
		// setbounds(x,y,width,heigth)
		label.setBounds(30,40,450,20);
		radioButtons[0].setBounds(50,80,450,20);
		radioButtons[1].setBounds(50,110,200,20);
		radioButtons[2].setBounds(50,140,200,20);
		radioButtons[3].setBounds(50,170,200,20);
		
		btnNext.setBounds(100,240,100,30);
		btnResult.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
		
	}
	
	void setData()
	{
		radioButtons[4].setSelected(true);
		if(current==0)
		{
			label.setText("Question 1 : Number of primitive data types in Java are?");
			radioButtons[0].setText("6");
			radioButtons[1].setText("7");
			radioButtons[2].setText("8");
			radioButtons[3].setText("9");
		}
		if(current==1)
		{
			label.setText("Question 2 : What is the size of float and double in java?");
			radioButtons[0].setText("32 and 64");
			radioButtons[1].setText("32 and 32");
			radioButtons[2].setText("64 and 64");
			radioButtons[3].setText("64 and 32");
		}
		if(current==2)
		{
			label.setText("Question 3 : Automatic type conversion is possible in which of the possible cases?");
			radioButtons[0].setText("Byte to int");
			radioButtons[1].setText("Int to long");
			radioButtons[2].setText("Long to int");
			radioButtons[3].setText("Short to int");
		}
		if(current==3)
		{
			label.setText("Question 4 : Select the valid statement.");
			radioButtons[0].setText("Char[] ch = new char(5)");
			radioButtons[1].setText("Char[] ch = new char[5]");
			radioButtons[2].setText("Char[] ch = new char()");
			radioButtons[3].setText("Char[] ch = new char[]");
		}
		if(current==4)
		{
			label.setText("Question 5 : When an array is passed to a method, what does the method receive?");
			radioButtons[0].setText("The reference of the array");
			radioButtons[1].setText("A copy of the array");
			radioButtons[2].setText("Length of the array");
			radioButtons[3].setText("Copy of first element");
		}
		if(current==5)
		{
			label.setText("Question 6 : Select the valid statement to declare and initialize an array.");
			radioButtons[0].setText("int[] A = {}");
			radioButtons[1].setText("int[] A = {1,2,3}");
			radioButtons[2].setText("int[] A = (1,2,3)");
			radioButtons[3].setText("int[][] A = {1,2,3}");
		}
		if(current==6)
		{
			label.setText("Question 7 : Arrays in java are - ");
			radioButtons[0].setText("Object references");
			radioButtons[1].setText("Objects");
			radioButtons[2].setText("Primitive data type");
			radioButtons[3].setText("None");
		}
		if(current==7)
		{
			label.setText("Question 8 : When is the object created with new keyword?");
			radioButtons[0].setText("At run time");
			radioButtons[1].setText("At compile time");
			radioButtons[2].setText("Depends on the code");
			radioButtons[3].setText("None");
		}
		if(current==8)
		{
			label.setText("Question 9 : Identify the corrected definition of a package.");
			radioButtons[0].setText("A package is a collection of edigting tools");
			radioButtons[1].setText("A package is a collection of classes");
			radioButtons[2].setText("A packeage is a collection of classes and interfaces");
			radioButtons[3].setText("A package is a collection of interfaces");
		}
		if(current==9)
		{
			label.setText("Question 10 : In which of the following is toString() method defined?");
			radioButtons[0].setText("java.lang.Object");
			radioButtons[1].setText("java.lang.String");
			radioButtons[2].setText("java.lang.util");
			radioButtons[3].setText("None");
		}
		for(int i=0,j=0;i<90;i+=30,j++)
		{
			radioButtons[j].setBounds(50,80+i,200,20);
		}
	}	
	
	boolean checkAns()
	{
		if(current==0)
		{
			return (radioButtons[2].isSelected());
		}
		if(current==1)
		{
			return (radioButtons[0].isSelected());
		}
		if(current==2)
		{
			return (radioButtons[1].isSelected());
		}
		if(current==3)
		{
			return (radioButtons[1].isSelected());
		}
		if(current==4)
		{
			return (radioButtons[0].isSelected());
		}
		if(current==5)
		{
			return (radioButtons[1].isSelected());
		}
		if(current==6)
		{
			return (radioButtons[1].isSelected());
		}
		if(current==7)
		{
			return (radioButtons[0].isSelected());
		}
		if(current==8)
		{
			return (radioButtons[2].isSelected());
		}
		if(current==9)
		{
			return (radioButtons[0].isSelected());
		}
		return false;
	}
	
	public static void main(String []args)
	{
		new QuizTest("Simple Quiz App");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnNext)
		{
			if(checkAns())
			{
				count=count+1;
			}
			current++;
			setData();
			if(current==9)
			{
				btnNext.setEnabled(false);
				btnResult.setVisible(true);
				btnResult.setText("Result");
			}
		}
		
		if(e.getActionCommand().equals("Result")) {
			if(checkAns())
			{
				count=count+1;
			}
			current++;
			JOptionPane.showMessageDialog(this, "Correct Ans are " + count);
			System.exit(0);
		}
		
	}
	
}
