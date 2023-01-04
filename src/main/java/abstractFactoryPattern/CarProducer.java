package abstractFactoryPattern;

public class CarProducer {
	
	public static AbstractFactory getFactory(Boolean factory) {
		if(factory) {
			return new SedanFactory();
		}else {
			return new HatchbackFactory();
		}
	}

}
