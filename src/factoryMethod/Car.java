package factoryMethod;

public abstract class Car {
	
	protected String bodyStyle;
	protected String power;
	protected String engine;
	protected String carType;
  
	void color(String color) {
		System.out.printf("Car has been colored %s.",color);
	}
 
	void sell() {
		System.out.println("Car has been sold.");
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("--------------"+carType+"--------------------- \n");
		sb.append(" Body: ");
		sb.append(bodyStyle);
		sb.append("\n Power: ");
		sb.append(power);
		sb.append("\n Engine: ");
		sb.append(engine);
		
		return sb.toString();
	}
}
