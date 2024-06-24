package ch07.sec08.ex02;

public class Driver {
	// Vehicle 객체, Bus 객체, Taxi 객체
	public void drive(Vehicle vehicle) {
		System.out.println("drive Vehicle");
		vehicle.run();
	}
	
	public void drive(Bus vehicle) {
		System.out.println("drive Bus");
		vehicle.run();
	}
}
// Vehicle vehicle = new Vehicle();
// Vehicle vehicle = new Taxi();
// Vehicle vehicle = new Bus();
