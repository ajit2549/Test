package abstractFactoryPattern;

public class CarFactoryDemo {
	public static void main(String[] args) {
			AbstractFactory factory = CarProducer.getFactory(true);
			Vehicle sedan = factory.getVehicle("VERITO");
			sedan.drive();
	}

}
