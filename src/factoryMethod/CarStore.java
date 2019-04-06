package factoryMethod;

public abstract class CarStore{
	
	public abstract Car createCar(String type);
	
	public Car orderCar(String type){
		Car car =  createCar(type);
		car.color("red");
		return car;
	}
	
}
