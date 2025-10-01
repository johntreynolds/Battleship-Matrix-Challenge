import java.util.Scanner;

public class PlayerInteraction
	{
		static Scanner userStringInput;
		static int userStrike;
		static int guessedRowLocation;
		static int guessedColLocation;

		public static void welcomePlayer()
			{
				System.out.println("Welcome to battleship");
				System.out.println("The grid is 5 x 5");
				System.out.println("To enter in a square you want to fire at, select a space like A1, B2, etc");

				// Space
				System.out.println("");
			}

		public static void takeUserInput()
			{
				System.out.println("Tell me where you shall strike the other ship");
				Scanner userStringInput = new Scanner(System.in);
				String userStrike = userStringInput.nextLine();
				userStrike = userStrike.toUpperCase();

				switch (userStrike)
					{
					case "A1":
						{
							guessedRowLocation = 0;
							guessedColLocation = 0;
							break;
						}
					case "A2":
						{
							guessedRowLocation = 0;
							guessedColLocation = 1;
							break;
						}
					case "A3":
						{
							guessedRowLocation = 0;
							guessedColLocation = 2;
							break;
						}
					case "A4":
						{
							guessedRowLocation = 0;
							guessedColLocation = 3;
							break;
						}
					case "A5":
						{
							guessedRowLocation = 0;
							guessedColLocation = 4;
							break;
						}
					case "B1":
						{
							guessedRowLocation = 1;
							guessedColLocation = 0;
							break;
						}
					case "B2":
						{
							guessedRowLocation = 1;
							guessedColLocation = 1;
							break;
						}
					case "B3":
						{
							guessedRowLocation = 1;
							guessedColLocation = 2;
							break;
						}
					case "B4":
						{
							guessedRowLocation = 1;
							guessedColLocation = 3;
							break;
						}
					case "B5":
						{
							guessedRowLocation = 1;
							guessedColLocation = 4;
							break;
						}
					case "C1":
						{
							guessedRowLocation = 2;
							guessedColLocation = 0;
							break;
						}
					case "C2":
						{
							guessedRowLocation = 2;
							guessedColLocation = 1;
							break;
						}
					case "C3":
						{
							guessedRowLocation = 2;
							guessedColLocation = 2;
							break;
						}
					case "C4":
						{
							guessedRowLocation = 2;
							guessedColLocation = 3;
							break;
						}
					case "C5":
						{
							guessedRowLocation = 2;
							guessedColLocation = 4;
							break;
						}
					case "D1":
						{
							guessedRowLocation = 3;
							guessedColLocation = 0;
							break;
						}
					case "D2":
						{
							guessedRowLocation = 3;
							guessedColLocation = 1;
							break;
						}
					case "D3":
						{
							guessedRowLocation = 3;
							guessedColLocation = 2;
							break;
						}
					case "D4":
						{
							guessedRowLocation = 3;
							guessedColLocation = 3;
							break;
						}
					case "D5":
						{
							guessedRowLocation = 3;
							guessedColLocation = 4;
							break;
						}
					case "E1":
						{
							guessedRowLocation = 4;
							guessedColLocation = 0;
							break;
						}
					case "E2":
						{
							guessedRowLocation = 4;
							guessedColLocation = 1;
							break;
						}
					case "E3":
						{
							guessedRowLocation = 4;
							guessedColLocation = 2;
							break;
						}
					case "E4":
						{
							guessedRowLocation = 4;
							guessedColLocation = 3;
							break;
						}
					case "E5":
						{
							guessedRowLocation = 4;
							guessedColLocation = 4;
							break;
						}

					default:
						{
							System.out.println("");
							System.out.println("That is not a valid input");
							System.out.println("Guess again");
							takeUserInput();
						}
					}
				System.out.println("You fired on " + userStrike);

				// Space
				System.out.println("");

			}

		public static void checkGuessConditions()
			{

				if (Boards.computerGivenShipBoard[guessedRowLocation][guessedColLocation].equals("S"))
					{
						Boards.userBoard[guessedRowLocation][guessedColLocation] = "H";
					}
				else
					{
						Boards.userBoard[guessedRowLocation][guessedColLocation] = "M";
					}

			}
	}
