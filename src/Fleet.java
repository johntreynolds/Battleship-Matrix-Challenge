import java.util.ArrayList;
import java.util.Collections;

public class Fleet
	{
		static ArrayList<Ship> fleet = new ArrayList<Ship>();

		public static void fillDeck()
			{
				// number of space , ship name, direction (hori or vert), number of hits, sunk
				//Index 0
				fleet.add(new Ship(5, "Carrier", "", 0, false));
				//Index 1
				fleet.add(new Ship(4, "Battleship", "", 0, false));
				//Index 2
				fleet.add(new Ship(3, "Cruiser", "", 0, false));
				//Index 3
				fleet.add(new Ship(3, "Submarine", "", 0, false));
				//Index 4
				fleet.add(new Ship(2, "Destroyer", "", 0, false));
			}
	}