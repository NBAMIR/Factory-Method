package factoryMethod;

public class SportsCarStore extends CarStore{

	@Override
	public Car createCar(String type) {
		if (type.equals("sports")){
			return new SportsCar();
		}
		
		return null;
	}
	

}
