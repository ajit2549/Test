package abstractFactoryPattern;

public class HatchbackFactory extends AbstractFactory{

	@Override
	Vehicle getVehicle(String type) {
		if(type.equalsIgnoreCase("IGNIS")) {
			return new Ignis();
		}else if(type.equalsIgnoreCase("TIAGO")) {
			return new Tiago();
		}else {
			return null;
		}
	}

}
