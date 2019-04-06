package factoryMethod;

public class SedanCar extends Car {
	
	public SedanCar() { 
		bodyStyle = "External dimensions: overall length (inches): 202.9, " +
				"overall width (inches): 76.2, overall height (inches): 60.7, wheelbase (inches): 112.9," +
				" front track (inches): 65.3, rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5";
		power="285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm";
		engine="3.5L Duramax V 6 DOHC";
		carType="SEDAN";
	}
}
