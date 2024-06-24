package factory;

public class Airplane implements Transportation {

	@Override
	public void move() {
		System.out.println("비행기가 날아갑니다.");
		
	}

}
