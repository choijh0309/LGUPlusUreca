package ch08.sec05;

public class Audio implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("audio 를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("audio 를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨은 " + this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("재정의 무음 처리");
			setVolume(MIN_VOLUME); // 구현부를 가지는 default 메소드에서 위 추상 메소드를 호출
		} else {
			System.out.println("재정의 무음 해제");
		}
	}
	
}
