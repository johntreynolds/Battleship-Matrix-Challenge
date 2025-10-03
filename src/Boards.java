
public class Boards
	{
		static String[][] user5x5Board = new String[5][5];
		static String[][] computerGivenShip5x5Board = new String[5][5];

		public static void initialize5x5EmptyBoard()
			{

				// Fill Board with empty spaces
				for (int row = 0; row < user5x5Board.length; row++)
					{
						for (int col = 0; col < user5x5Board[row].length; col++)
							{
								user5x5Board[row][col] = " ";
							}
					}

			}

		public static void print5x5Board()
			{
				// Print Out Board
				System.out.println("    1   2   3   4   5");
				System.out.println("  ---------------------");
				System.out.println("A | " + user5x5Board[0][0] + " | " + user5x5Board[0][1] + " | " + user5x5Board[0][2] + " | "
						+ user5x5Board[0][3] + " | " + user5x5Board[0][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("B | " + user5x5Board[1][0] + " | " + user5x5Board[1][1] + " | " + user5x5Board[1][2] + " | "
						+ user5x5Board[1][3] + " | " + user5x5Board[1][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("C | " + user5x5Board[2][0] + " | " + user5x5Board[2][1] + " | " + user5x5Board[2][2] + " | "
						+ user5x5Board[2][3] + " | " + user5x5Board[2][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("D | " + user5x5Board[3][0] + " | " + user5x5Board[3][1] + " | " + user5x5Board[3][2] + " | "
						+ user5x5Board[3][3] + " | " + user5x5Board[3][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("E | " + user5x5Board[4][0] + " | " + user5x5Board[4][1] + " | " + user5x5Board[4][2] + " | "
						+ user5x5Board[4][3] + " | " + user5x5Board[4][4] + " |");
				System.out.println("  ---------------------");

				// Space
				System.out.println("");
			}

		public static void initializeComputerGivenShips()
			{
				// Fill Board with empty spaces
				for (int row = 0; row < computerGivenShip5x5Board.length; row++)
					{
						for (int col = 0; col < computerGivenShip5x5Board[row].length; col++)
							{
								computerGivenShip5x5Board[row][col] = " ";
							}
					}
			}

		public static void computerGivenShips5x5()
			{
				computerGivenShip5x5Board[1][0] = "S";
				computerGivenShip5x5Board[1][1] = "S";
				computerGivenShip5x5Board[1][2] = "S";
				computerGivenShip5x5Board[3][3] = "S";
				computerGivenShip5x5Board[4][3] = "S";
			}
	}
