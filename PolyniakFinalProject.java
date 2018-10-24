// Seth Polyniak
// 5/3/18
// Program that simulates a game of tic-tac-toe played between the user and a cpu

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;


public class PolyniakFinalProject extends JFrame
{
	// ABC are the rows of grid & 123 are the columns of grid
	
	// 9 panels for 9 spaces in tic-tac-toe
	private JPanel panelA1;
	private JPanel panelA2;
	private JPanel panelA3;
	private JPanel panelB1;
	private JPanel panelB2;
	private JPanel panelB3;
	private JPanel panelC1;
	private JPanel panelC2;
	private JPanel panelC3;
	
	// 9 buttons for 9 spaces in tic-tac-toe
	private JButton buttonA1;
	private JButton buttonA2;
	private JButton buttonA3;
	private JButton buttonB1;
	private JButton buttonB2;
	private JButton buttonB3;
	private JButton buttonC1;
	private JButton buttonC2;
	private JButton buttonC3;
	
	// Intitialize an array to hold all 9 buttons (spaces)
	// ~ used to cycle through spaces when checking spaces
	private JButton[] buttons;

	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 200;
	
	// Creates new random object to pick a random space for cpu
	static Random rnd = new Random();
	
	// Constructor
	public PolyniakFinalProject()
	{
		setTitle("Tic-Tac-Toe");							// Sets title
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);			// Sets window size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// What to do on close
		setLayout(new GridLayout(3,3));					// 3 rows & columns
		buildButtons();									// Builds all the buttons
		
		// Add all buttons in correct grid fashion
		add(buttonA1);
		add(buttonA2);
		add(buttonA3);
		add(buttonB1);
		add(buttonB2);
		add(buttonB3);
		add(buttonC1);
		add(buttonC2);
		add(buttonC3);
		
		setVisible(true);
	}
	
	private void buildButtons()
	{
		// Fills buttons with empty spaces
		buttonA1 = new JButton(" ");
		buttonA2 = new JButton(" ");
		buttonA3 = new JButton(" ");
		buttonB1 = new JButton(" ");
		buttonB2 = new JButton(" ");
		buttonB3 = new JButton(" ");
		buttonC1 = new JButton(" ");
		buttonC2 = new JButton(" ");
		buttonC3 = new JButton(" ");
		
		// Add an action listener to the button.
	    buttonA1.addActionListener(new A1ButtonListener());
	    buttonA2.addActionListener(new A2ButtonListener());
	    buttonA3.addActionListener(new A3ButtonListener());
	    buttonB1.addActionListener(new B1ButtonListener());
	    buttonB2.addActionListener(new B2ButtonListener());
	    buttonB3.addActionListener(new B3ButtonListener());
	    buttonC1.addActionListener(new C1ButtonListener());
	    buttonC2.addActionListener(new C2ButtonListener());
	    buttonC3.addActionListener(new C3ButtonListener());
	    
	    	// Array to hold all spaces (buttons)  
	    // ~ used to cycle through spaces to see if they contain an "X" or "O"
	 	buttons = new JButton[] {buttonA1, buttonA2, buttonA3, 
	 							buttonB1, buttonB2, buttonB3, 
	 							buttonC1, buttonC2, buttonC3};
	}
	
	// These 9 button listener methods will output an "X" on the space when the player clicks the button
	// They will check if the board is full of Xs or Os, and if not then the CPU will
	//     randomly place an O on an empty space
	// ~ used to simulate turn taking between player and computer
	private class A1ButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  if(!checkWinner())
	    	  {
	    		  // This if statement will make sure that the space is empty before placing an X
	    		  if(buttonA1.getText().equals(" "))
	    		  {
	    			  buttonA1.setText("X");
	    	  
	    			  // This if statement will check if there is an empty space on the board and then call cpu()
	    			  	if(!ifFull(buttons))
	    			  	{
	    			  		cpuTurn(buttons);
	    			  	}
	    		  }
	    	  checkWinner();
	    	  }
	      }
	   }
	private class A2ButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  if(!checkWinner())
	    	  {
	    		  if(buttonA2.getText().equals(" "))
	    		  {
	    			  buttonA2.setText("X");
	    			  
	    			  if(!ifFull(buttons))
	    			  {
	    				  cpuTurn(buttons);
	    			  }
	    		  }
	    	  }
	    	  checkWinner();
	      }
	   }
	private class A3ButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  if(!checkWinner())
	    	  {
	    		  if(buttonA3.getText().equals(" "))
	    		  {
	    			  buttonA3.setText("X");
	    			  
	    			  if(!ifFull(buttons))
	    			  {
	    				  cpuTurn(buttons);
	    			  }
	    		  }
	    	  }
	    	  checkWinner();
	      }
	   }
	private class B1ButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  if(!checkWinner())
	    	  {
	    		  if(buttonB1.getText().equals(" "))
	    		  {
	    			  buttonB1.setText("X");
	    			  
	    			  if(!ifFull(buttons))
	    			  {
	    				  cpuTurn(buttons);
	    			  }
	    		  }
	    	  	}
	    	  checkWinner();
	      }
	   }
	private class B2ButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  if(!checkWinner())
	    	  {
	    		  if(buttonB2.getText().equals(" "))
	    		  {
	    			  buttonB2.setText("X");
	    			  
	    			  if(!ifFull(buttons))
	    			  {
	    				  cpuTurn(buttons);
	    			  }	
	    		  }
	    	  }
	    	  checkWinner();
	      }
	   }
	private class B3ButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  if(!checkWinner())
	    	  {
	    		  if(buttonB3.getText().equals(" "))
	    		  {
	    			  buttonB3.setText("X");
	    			  
	    			  if(!ifFull(buttons))
	    			  {
	    				  cpuTurn(buttons);
	    			  }
	    		  }
	    	  }
	    	  checkWinner();
	      }
	   }
	private class C1ButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  if(!checkWinner())
	    	  {
	    		  if(buttonC1.getText().equals(" "))
	    		  {
	    			  buttonC1.setText("X");
	    			  
	    			  if(!ifFull(buttons))
	    			  {
	    				  cpuTurn(buttons);
	    			  }
	    		  }
	    	  }
	    	  checkWinner();
	      }
	   }
	private class C2ButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  if(!checkWinner())
	    	  {
	    		  if(buttonC2.getText().equals(" "))
	    		  {
	    			  buttonC2.setText("X");
	    			  
	    			  if(!ifFull(buttons))
	    			  {
	    				  cpuTurn(buttons);
	    			  }
	    		  }
	    	  }
	    	  checkWinner();
	      }
	   }
	private class C3ButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  if(!checkWinner())
	    	  {
	    		  if(buttonC3.getText().equals(" "))
	    		  {
	    			  buttonC3.setText("X");
	    			  
	    			  if(!ifFull(buttons))
	    			  {
	    				  cpuTurn(buttons);
	    			  }
	    		  }
	    	  }
	    	  checkWinner();
	      }
	   }
	
	// Method that will randomly place an "O" in an empty space
	// to simulate the cpu's turn
	// @param - The button array 
	public void cpuTurn(JButton[] buttons)
	{
		// Chooses a random space on the board
		int i = rnd.nextInt(8);					
		
		// If chosen space has an "X", keep randomizing until a blank space is reached
		while(buttons[i].getText().equals("X") || buttons[i].getText().equals("O"))
		{
			i = rnd.nextInt(8);				// randomize another space
		}
		// Set text of empty space to "O" to simulate the opponent marking a space with a "O"
		buttons[i].setText("O");
	}
	
	// Method checks if all the spaces hold an X or O value
	// ~ used so the loop in cpu() isn't infinite
	// ~ used to determine end of the game for checkWinner()
	public boolean ifFull(JButton[] buttons)
	{
		// Boolean that returns true if all buttons hold a value
		boolean full = false;
		// int that counts how many non-empty spaces there are
		int count = 0;
		
		// For-loop cycles through buttons (spaces on board) 
		// & checks if they or empty or not
		// ~ used to determine to call cpu() or not
		for(int i = 0; i < buttons.length; i++)
		{
			if(!buttons[i].getText().equals(" "))
			{
				count++;
			}
		}
		// If all 9 spaces are filled with X or O, full = true
		if(count == buttons.length)
		{
			full = true;
		}
		return full;
	}
	
	// Method to check the winner , 8 different ways to win for each player
	
	public boolean checkWinner()
	{
		boolean playerWin = false;			// True if player won ~used to output message to player
		boolean cpuWin = false;				// True if cpu won ~used to output message to cpu
		boolean winner = false;				// Used to check end of game
		
		// 8 win conditions for player
		// Checks if certain spaces hold the "X" value
		
		// Satisfies first row win
		if(buttonA1.getText().equals("X") && buttonA2.getText().equals("X") && buttonA3.getText().equals("X"))
		{
			playerWin = true;
		}
		// Satisfies second row win
		else if(buttonB1.getText().equals("X") && buttonB2.getText().equals("X") && buttonB3.getText().equals("X"))
		{
			playerWin = true;
		}
		// Satisfies third row win
		else if(buttonC1.getText().equals("X") && buttonC2.getText().equals("X") && buttonC3.getText().equals("X"))
		{
			playerWin = true;
		}
		// Satisfies first column win
		else if(buttonA1.getText().equals("X") && buttonB1.getText().equals("X") && buttonC1.getText().equals("X"))
		{
			playerWin = true;
		}
		// Satisfies second column win
		else if(buttonA2.getText().equals("X") && buttonB2.getText().equals("X") && buttonC2.getText().equals("X"))
		{
			playerWin = true;
		}
		// Satisfies third column win
		else if(buttonA3.getText().equals("X") && buttonB3.getText().equals("X") && buttonC3.getText().equals("X"))
		{
			playerWin = true;
		}
		// Satisfies top left to bottom right diagonal win 
		else if(buttonA1.getText().equals("X") && buttonB2.getText().equals("X") && buttonC3.getText().equals("X"))
		{
			playerWin = true;
		}
		// Satisfies bottom left to top right diagonal win 
		else if(buttonC1.getText().equals("X") && buttonB2.getText().equals("X") && buttonA3.getText().equals("X"))
		{
			playerWin = true;
		}
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		// 8 win conditions for cpu
		// Checks if certain spaces hold the "O" value
		
		// Satisfies first row win
		else if(buttonA1.getText().equals("O") && buttonA2.getText().equals("O") && buttonA3.getText().equals("O"))
		{
			cpuWin = true;
		}
		// Satisfies second row win
		else if(buttonB1.getText().equals("O") && buttonB2.getText().equals("O") && buttonB3.getText().equals("O"))
		{
			cpuWin = true;
		}
		// Satisfies third row win
		else if(buttonC1.getText().equals("O") && buttonC2.getText().equals("O") && buttonC3.getText().equals("O"))
		{
			cpuWin = true;
		}
		// Satisfies first column win
		else if(buttonA1.getText().equals("O") && buttonB1.getText().equals("O") && buttonC1.getText().equals("O"))
		{
			cpuWin = true;
		}
		// Satisfies second column win
		else if(buttonA2.getText().equals("O") && buttonB2.getText().equals("O") && buttonC2.getText().equals("O"))
		{
			cpuWin = true;
		}
		// Satisfies third column win
		else if(buttonA3.getText().equals("O") && buttonB3.getText().equals("O") && buttonC3.getText().equals("O"))
		{
			cpuWin = true;
		}
		// Satisfies top left to bottom right diagonal win 
		else if(buttonA1.getText().equals("O") && buttonB2.getText().equals("O") && buttonC3.getText().equals("O"))
		{
			cpuWin = true;
		}
		// Satisfies bottom left to top right diagonal win 
		else if(buttonC1.getText().equals("O") && buttonB2.getText().equals("O") && buttonA3.getText().equals("O"))
		{
			cpuWin = true;
		}
		
		// If statement that checks if either player has won
		// ~ useful for having a condition to use when checking for end of the game
		if(playerWin == true || cpuWin == true)
		{
			winner = true;
			
			if(playerWin)
			{
				buttonB2.setText("You have won the game!");
			}
			else
			{
				buttonB2.setText("The CPU has won the game!");
			}
		}
		
		return winner;
	}
	
	public static void main(String[] args)
	{
		new PolyniakFinalProject();
	}
}
