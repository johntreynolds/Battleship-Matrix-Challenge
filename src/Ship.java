public class Ship
	{
		private int shipSpaces;
		private String shipName;
		private String horiOrVert;
		private int hitNumber;
		private boolean sunk;

		public Ship(int n, String name, String direction, int h, boolean s)
			{
				shipSpaces = n;
				shipName = name;
				horiOrVert = direction;
				hitNumber = h;
				sunk = s;
			}

		public int getShipSpaces()
			{
				return shipSpaces;
			}

		public void setShipSpaces(int shipSpaces)
			{
				this.shipSpaces = shipSpaces;
			}

		public boolean isSunk()
			{
				return sunk;
			}

		public void setSunk(boolean sunk)
			{
				this.sunk = sunk;
			}

		public int getHitNumber()
			{
				return hitNumber;
			}

		public String getHoriOrVert()
			{
				return horiOrVert;
			}

		public void setHoriOrVert(String horiOrVert)
			{
				this.horiOrVert = horiOrVert;
			}

		public void setHitNumber(int hitNumber)
			{
				this.hitNumber = hitNumber;
			}

		public String getShipName()
			{
				return shipName;
			}

		public void setShipName(String shipName)
			{
				this.shipName = shipName;
			}

	}
