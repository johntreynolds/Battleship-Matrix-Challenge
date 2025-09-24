
public class BattleshipRunner
	{

		public static void main(String[] args)
			{
				PlayerInteraction.welcomePlayer();
				Boards.fillEmptyBoard();
				PlayerInteraction.takeUserInput();
				Boards.gameBoard();

			}

	}
