# SnakesAndLadders

Approach to the solution:
The overall approach to the solution was to keep it simple while following the single responsibility design principle.
I created 4 classes -  Board, Dice, Player and SnakesAndLadders, while keeping an eye on how the implementation can be extended in future to implement the entire "Snakes and Ladders" game.
- Board class has all the details related to squares and those details are static. This has only states.
- Dice class has a behaviour of rolling so it just gives the random number from 1 to 6.
- Player is a POJO class, where we store the name and token for each player. This class will help us scale our solution ahead for multiple users.
  We can just make a list of players and save their name and current position on the board. whoever reaches the 100th square first will win the game.
- SnakesAndLadders(Main class): This class will take inputs from user and start the game. Once the player is instantiated we will store the current position with the initialPositon as 1 (constant from Board class). On each player's turn we will update the token as per the dice roll result. 

Key Design Decisions:
- Following the single responsibility design principle, enabling me to have multiple classes with limited yet related responsibilities.
- I considered to keep board object as part of the SnakesAndLadders class. This would have enabled each SnakesAndLadders game instance to have its own instance of the board. However, on further deliberation, I thought that the board is a constant configuration for the game and does not matter whether the SnakesAndLadders game instance has a separate object or it just access a single static reference to understand the current configuration of the board.
- Since the feature did not deal with multiple players at this point of time, I considered whether to really have a player object at this point or nor.
However, after some deliberation, I felt that player is a logical entity in the game and creating player object would eventually serve the purpose when extending the game to a multiple player version.

Vision on Evolution of Game code:
I envision the utilization of player object to extend the game to multi-player version.
I also envision the extension of board class to include other aspects of the board configuration - for example, the position of snakes and ladders.
These snakes and ladders can be treated in a similar way - for example, snakes can be treated as inverse directed ladders or vice versa.
The SnakesAndLadders class would be enhanced to deal with multiple players and to advise each player on their turn to play, along with the decision on when a player has won and the game needs to be stopped.

Steps to run the solution :
	1. Download or clone the repository
	2. Go to root folder and run : javac src/uk/navico/exercise/*.java
	3. Then go to src folder and run : java uk.navico.exercise.SnakeAndLadder
	4. Well the game is started now !!