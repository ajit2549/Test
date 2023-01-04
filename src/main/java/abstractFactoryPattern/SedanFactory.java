package abstractFactoryPattern;

public class SedanFactory extends AbstractFactory{
	
	@Override
	Vehicle getVehicle(String type) {
		if(type.equalsIgnoreCase("DZIRE")) {
			return new Dzire();
		}else if(type.equalsIgnoreCase("VERITO")) {
			return new Verito();
		}else {
			return null;
		}
	}
}
