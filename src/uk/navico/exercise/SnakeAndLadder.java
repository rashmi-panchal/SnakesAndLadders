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
        
        System.out.println("\n"+"Hi "+playerName+", do you want to start the game ? Y or N :");
        String userChoice = userInput.readLine();
        
        if(userChoice != "" && userChoice.equals("y") || userChoice.equals("Y")) {
        
        	//Start the game with given user.
        	new SnakeAndLadder().start(player);
        }
        
        System.out.println("\n Thank you !!!");
        
        userInput.close();
	}
	
	private void start(Player player) throws IOException {
		BufferedReader userInput = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("\n"+player.getName()+" is at position "+player.getToken());
		
		while(player.getToken() < Board.winPosition) {
			
			System.out.println("\n Press any key to continue or Exit to quit the game.");
			
			String userChoice = userInput.readLine();
			
			if(userChoice.toLowerCase().equals("exit")){
				break;
			}
			
			System.out.println("Rolling dice for "+player.getName());
			int diceNumber = Dice.roll();
				
			int updatedPosition = player.getToken() + diceNumber;
			if(updatedPosition <= Board.winPosition) {
				player.setToken(updatedPosition);
			}
				
			System.out.println("\n"+player.getName()+" is at position: "+player.getToken());
		}
		
		if(player.getToken() == Board.winPosition) {
		    System.out.println("\n Congratulations "+ player.getName()+", you won !!!");
		}
		userInput.close();
	}

}
