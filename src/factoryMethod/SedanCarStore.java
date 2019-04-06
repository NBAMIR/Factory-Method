package factoryMethod;

public class SedanCarStore extends CarStore{

	@Override
	public Car createCar(String type) {
		if (type.equals("sedan")){
			return new SedanCar();
		}
		
		return null;
	}
	

}
