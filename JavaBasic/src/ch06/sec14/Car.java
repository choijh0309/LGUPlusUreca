package ch06.sec14;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		if (speed <= 0) {
			this.speed = 0;
			setStop(false);
//			this.stop = true;
		} else {
			this.speed = speed;
			setStop(false);
//			this.stop = false;
		}
	}
	
	public boolean isStop() {
		return this.stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}

// setter, getter 는 형식이 중요
