package factoryMethod;

public class TestFactoryDesign {
	
	public static void main(String[] args) {
	
	SedanCarStore factory = new SedanCarStore();
	Car car = factory.createCar("sedan");
	System.out.println(car);
	
	SportsCarStore factory2 = new SportsCarStore();
	Car car2 = factory2.createCar("sports");
	System.out.println(car2);
	
	}
}
