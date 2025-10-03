
public class BattleshipRunner
	{

		public static void main(String[] args)
			{
				// Welcome Player and give out empty board
				PlayerInteraction.welcomePlayer();
				PlayerInteraction.pickGameSize();
				Boards.initializeComputerGivenShips();
				
				// Battleship with five spaces
				if (PlayerInteraction.shipsLeft == 5)
					{
						//Print out 5x5 board
						Boards.initialize5x5EmptyBoard();
						Boards.print5x5Board();
						
						// Set battleships on board
						Boards.computerGivenShips5x5();

						while (PlayerInteraction.shipsLeft > 0)
							{
								// Take user input and display board
								PlayerInteraction.takeUserInput();
								PlayerInteraction.checkGuessConditions();
								Boards.print5x5Board();
							}
						
						System.out.println("Game over, you win!!!");
						
						
					}

				if (PlayerInteraction.shipsLeft == 10)
					{
						System.exit(0);
					}


				
				

				

			}

	}
