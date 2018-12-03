package uk.navico.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeAndLadder {

	public static void main(String[] args) throws IOException {
		
        BufferedReader userInput = new BufferedReader (new InputStreamReader (System.in));
		
        // Print the welcome screen and instructions
        System.out.println ("\t\t\t\t\t\tWelcome To Snakes And Ladders\n\n");
        System.out.println ("\t\t\t\t\t\t\tInstructions:");
        System.out.println ("\t\t\tThis program will simulate a regular snakes and ladders game.");
        System.out.println ("\t\t\tYou will start at square 1, and the first one to");
        System.out.println ("\t\t\tsquare 100 wins.");
        System.out.println ("\t\t\t\t\t\tGood Luck and Have FUN!!!");
        
        System.out.println("\n\n");
        
        //To be implemented in feature:3
        //We can get the players count here and update the players array with the Player objects.
        //System.out.println("Please enter the number of players:");
        
        System.out.println("Please enter your name:");
        
        String playerName = userInput.readLine();
        Player player = new Player(playerName);
        
        System.out.println("\nPress any key to continue or 'Exit' to quit the game.");
        String userChoice = userInput.readLine();
        
		if(!userChoice.toLowerCase().equals("exit")){
			new SnakeAndLadder().start(player, userInput);
		}
        
        System.out.println("\nThank you !!!");
        userInput.close();
	}
	
	private void start(Player player, BufferedReader userInput) throws IOException {
		String playerName = player.getName();
		int playerToken = player.getToken();
		
		System.out.println("\n"+playerName+" is at position "+playerToken);
		
		while(player.getToken() < Board.winPosition) {	
			System.out.println("\nPress any key to continue or 'Exit' to quit the game.");
			String userChoice = userInput.readLine();
			if(userChoice.toLowerCase().equals("exit")){
				break;
			}
			
			System.out.println("Rolling dice for "+playerName+"...");
			int diceNumber = Dice.roll();
			
			System.out.println("\nDice number for "+playerName+" is: "+diceNumber);
			int updatedPosition = player.getToken() + diceNumber;
			//We can add a logic to move a token after considering snakes and ladder positions.
			
			if(updatedPosition <= Board.winPosition) {
				player.setToken(updatedPosition);
			}
				
			System.out.println("\n"+playerName+" is at position: "+player.getToken());
		}
		
		if(player.getToken() == Board.winPosition) {
		    System.out.println("\nCongratulations "+playerName+", you won !!!");
		}
	}

}
