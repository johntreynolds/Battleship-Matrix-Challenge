
public class Boards
	{
		static String[][] emptyBoard;

		public static void fillEmptyBoard()
			{
				emptyBoard = new String[5][5];

				// Fill Board with empty spaces
				for (int row = 0; row < emptyBoard.length; row++)
					{
						for (int col = 0; col < emptyBoard[row].length; col++)
							{
								emptyBoard[row][col] = " ";
							}
					}

				// Print Out Board
				System.out.println("    1   2   3   4   5");
				System.out.println("  ---------------------");
				System.out.println("A | " + emptyBoard[0][0] + " | " + emptyBoard[0][1] + " | " + emptyBoard[0][2]
						+ " | " + emptyBoard[0][3] + " | " + emptyBoard[0][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("B | " + emptyBoard[1][0] + " | " + emptyBoard[1][1] + " | " + emptyBoard[1][2]
						+ " | " + emptyBoard[1][3] + " | " + emptyBoard[1][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("C | " + emptyBoard[2][0] + " | " + emptyBoard[2][1] + " | " + emptyBoard[2][2]
						+ " | " + emptyBoard[2][3] + " | " + emptyBoard[2][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("D | " + emptyBoard[3][0] + " | " + emptyBoard[3][1] + " | " + emptyBoard[3][2]
						+ " | " + emptyBoard[3][3] + " | " + emptyBoard[3][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("E | " + emptyBoard[4][0] + " | " + emptyBoard[4][1] + " | " + emptyBoard[4][2]
						+ " | " + emptyBoard[4][3] + " | " + emptyBoard[4][4] + " |");
				System.out.println("  ---------------------");

			}

		public static void gameBoard()
			{
				// Print Out Board
				System.out.println("    1   2   3   4   5");
				System.out.println("  ---------------------");
				System.out.println("A | " + emptyBoard[0][0] + " | " + emptyBoard[0][1] + " | " + emptyBoard[0][2] + " | "
				        + emptyBoard[0][3] + " | " + emptyBoard[0][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("B | " + emptyBoard[1][0] + " | " + emptyBoard[1][1] + " | " + emptyBoard[1][2] + " | "
				        + emptyBoard[1][3] + " | " + emptyBoard[1][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("C | " + emptyBoard[2][0] + " | " + emptyBoard[2][1] + " | " + emptyBoard[2][2] + " | "
				        + emptyBoard[2][3] + " | " + emptyBoard[2][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("D | " + emptyBoard[3][0] + " | " + emptyBoard[3][1] + " | " + emptyBoard[3][2] + " | "
				        + emptyBoard[3][3] + " | " + emptyBoard[3][4] + " |");
				System.out.println("  ---------------------");
				System.out.println("E | " + emptyBoard[4][0] + " | " + emptyBoard[4][1] + " | " + emptyBoard[4][2] + " | "
				        + emptyBoard[4][3] + " | " + emptyBoard[4][4] + " |");
				System.out.println("  ---------------------");
			}
	}
