package factoryMethod;

public class SportsCar extends Car {

	public SportsCar() { 
		bodyStyle = "External dimensions: overall length (inches): 192.3," +
				" overall width (inches): 75.5, overall height (inches): 54.2, wheelbase (inches): 112.3," +
				" front track (inches): 63.7, rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7";
		power="323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm";
		engine="3.6L V 6 DOHC and variable valve timing";
		carType="SPORTS";
	}
}
