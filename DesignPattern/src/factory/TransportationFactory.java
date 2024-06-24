package factory;

// XXXFactory 보통 Singleton 으로 구성
public class TransportationFactory {
	public static Transportation getTransportation(String clsf) {
		Transportation t = null;
		switch(clsf) {
			case "Air": t = new Airplane(); break;
			case "Car": t = new SportsCar(); break;
		}
		
		return t;
	}

}
