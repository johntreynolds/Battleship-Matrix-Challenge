
public class Boards
	{
		static String[][] userBoard = new String[5][5];
		static String[][] computerGivenShipBoard = new String[5][5];

		public static void initializeEmptyBoard()
			{

				// Fill Board with empty spaces
				for (int row = 0; row < userBoard.length; row++)
					{
						for (int col = 0; col < userBoard[row].length; col++)
							{
								userBoard[row][col] = " ";
							}
					}

			}

		public static void printBoard()
			{
				// Print Out Board
				System.out.println("    1   2   3   4   5");
				System.out.println("  ---------------------");
				System.out.println("A | " + userBoard[0][0] + " | " + userBoard[0][1] + " | " + userBoard[0][2] + " | "
						+ userBoard[0][3] + " | " + userBoard[0][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("B | " + userBoard[1][0] + " | " + userBoard[1][1] + " | " + userBoard[1][2] + " | "
						+ userBoard[1][3] + " | " + userBoard[1][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("C | " + userBoard[2][0] + " | " + userBoard[2][1] + " | " + userBoard[2][2] + " | "
						+ userBoard[2][3] + " | " + userBoard[2][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("D | " + userBoard[3][0] + " | " + userBoard[3][1] + " | " + userBoard[3][2] + " | "
						+ userBoard[3][3] + " | " + userBoard[3][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("E | " + userBoard[4][0] + " | " + userBoard[4][1] + " | " + userBoard[4][2] + " | "
						+ userBoard[4][3] + " | " + userBoard[4][4] + " |");
				System.out.println("  ---------------------");

				// Space
				System.out.println("");
			}

		public static void initializeComputerGivenShips()
			{
				// Fill Board with empty spaces
				for (int row = 0; row < computerGivenShipBoard.length; row++)
					{
						for (int col = 0; col < computerGivenShipBoard[row].length; col++)
							{
								computerGivenShipBoard[row][col] = " ";
							}
					}
			}

		public static void computerGivenShips()
			{
				computerGivenShipBoard[1][0] = "S";
				computerGivenShipBoard[1][1] = "S";
				computerGivenShipBoard[1][2] = "S";
				computerGivenShipBoard[3][3] = "S";
				computerGivenShipBoard[4][3] = "S";
			}
	}
