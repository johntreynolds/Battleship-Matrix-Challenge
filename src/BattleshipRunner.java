
public class BattleshipRunner
	{

		public static void main(String[] args)
			{
				//Welcome Player and give out empty board
				PlayerInteraction.welcomePlayer();
				Boards.initializeComputerGivenShips();
				Boards.initializeEmptyBoard();
				Boards.printBoard();
				
				//Set battleships on board
				Boards.computerGivenShips();
				
				//Take user input and display board
				PlayerInteraction.takeUserInput();
				PlayerInteraction.checkGuessConditions();
				Boards.printBoard();
				
				
				

			}

	}
