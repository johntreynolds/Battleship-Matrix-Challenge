import java.util.Scanner;

public class PlayerInteraction
	{
		public static void welcomePlayer()
			{
				System.out.println("Welcome to battleship");
				System.out.println("The grid is 5 x 5");
				System.out.println("To enter in a square you want to fire at, select a space like A1, B2, etc");
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
							Boards.emptyBoard[0][0] = "H";
							break;
						}
					default:
						{
							System.out.println("That is not a valid input");
						}
					}
			}
	}
