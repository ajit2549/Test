package factorypattern;

public class VehicleFactory {
	
	public Vehicle getVehicle(String vehicleType) {
		if(vehicleType.equalsIgnoreCase("BIKE")) {
			return new Bike();
		}else if(vehicleType.equalsIgnoreCase("CAR")) {
			return new Car();
		}else {
			return null;
		}
	}

}
