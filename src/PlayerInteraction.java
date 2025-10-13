import java.util.Scanner;

public class PlayerInteraction
	{
		// Scanners
		static Scanner userStringInput;
		static Scanner userIntInput;

		// Double Guess Check
		static boolean doubleGuess;

		// User strike
		static String userStrike;

		// Changing row and col locations
		static int guessedRowLocation;
		static int guessedColLocation;

		// Win condition
		static int shipsLeft;

		public static void welcomePlayer()
			{
				System.out.println("Welcome to battleship");
				System.out.println("The grid is 5 x 5");
				System.out.println("To enter in a square you want to fire at, select a space like A1, B2, etc");

				// Space
				System.out.println("");
			}

		public static void pickGameSize()
			{
				System.out.println("Would you like to play a game in a 5x5 board (2 ships: 3 and 2)");
				System.out.println("Or a game in a 10x10 board (5 ships: 5, 4, 3, 3, 2)");
				System.out.println("1) 5x5");
				System.out.println("2) 10x10");

				boolean correctAnswer = false;

				while (!correctAnswer)
					{
						userIntInput = new Scanner(System.in);
						int answer = userIntInput.nextInt();

						if (answer == 1)
							{
								shipsLeft = 5;
								break;
							}
						else if (answer == 2)
							{
								shipsLeft = 10;
								break;
							}
						else
							{
								System.out.println("Improper format, answer again");
								correctAnswer = false;
							}
					}

			}

		public static void takeUserInput()
			{
				System.out.println("Tell me where you shall strike the other ship");
				userStringInput = new Scanner(System.in);
				doubleGuess = true;

				while (doubleGuess)
					{
						userStrike = userStringInput.nextLine();
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

								}
							}

						antiDoubleGuess();
					}

			}

		public static void checkGuessConditions()
			{

				if (Boards.computerGivenShip5x5Board[guessedRowLocation][guessedColLocation].equals("S"))
					{
						Boards.user5x5Board[guessedRowLocation][guessedColLocation] = "H";
						System.out.println(userStrike + " is a hit!");
						shipsLeft--;

					}
				else
					{
						Boards.user5x5Board[guessedRowLocation][guessedColLocation] = "M";
						System.out.println(userStrike + " is a miss!");
					}

				if (shipsLeft > 0)
					{
						System.out.println("Fire Again");
					}

				// Space
				System.out.println("");

			}

		public static void antiDoubleGuess()

			{
				if (!Boards.user5x5Board[guessedRowLocation][guessedColLocation].equals(" "))
					{
						System.out.println("That's already been guessed, guess again");
						doubleGuess = true;
					}
				else
					{
						System.out.println("You fired on " + userStrike);
						doubleGuess = false;
					}
			}
	}
