public class Ship
	{
		private int hitNumber;
		private String shipName;
		private String horiOrVert;
		
		public Ship (int n, String name, String direction)
		{
			hitNumber = n;
			shipName = name;
			horiOrVert = direction;
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
