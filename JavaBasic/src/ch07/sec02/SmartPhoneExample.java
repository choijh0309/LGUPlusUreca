package ch07.sec02;

public class SmartPhoneExample {
	
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.model = "galaxy";
		System.out.println(phone.model);
		
		SmartPhone sPhone = new SmartPhone();
		sPhone.model = "galaxy";
		System.out.println(sPhone.model);
		
		sPhone.bell();
		sPhone.receiveVoice("Hello..");
		sPhone.setWifi(true);
		System.out.println(sPhone.wifi);
		sPhone.internet();
	}
	
}
