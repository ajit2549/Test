package factorypattern;

public class FactoryPattern {
	
	public static void main(String[] args) {
		Vehicle car = new VehicleFactory().getVehicle("CAR");
		car.drive();
		Vehicle bike = new VehicleFactory().getVehicle("BIKE");
		bike.drive();
	}
	

}
