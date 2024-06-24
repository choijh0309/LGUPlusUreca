
public class _11_Extract_Interface {
    // Old
    static class DogOld{
        void run() {}
        void eat() {}
    }
        
    static class BirdOld{
        void fly() {}
        void eat() {}
    }
    
    static class DuckOld{
        void fly() {}
        void run() {}
        void eat() {}
    }
    
    // 개별 클래스의 메소드들 중 동일한 기능을 수행하는 (설사 클래스가 서로 동일하지 않은(상송 관계에 없는)) 경우라면 인터페이스로 분리
    // eat -> Eatable, run -> Runnable, fly -> Flyable
    // New
    
    static interface Eatable { void eat(); }
    static interface Runnable { void run(); void runFaster();}
    static interface Flyable { void fly(); }
    
    static class DogNew implements Eatable, Runnable {
        public void run() {}
        public void eat() {}
		@Override
		public void runFaster() {
			// TODO Auto-generated method stub
			
		}
    }
        
    static class BirdNew implements Flyable, Eatable {
    	public void fly() {}
    	public void eat() {}
    }
    
    static class DuckNew implements Flyable, Eatable {
    	public void fly() {}
    	public  void run() {}
    	public  void eat() {}
    }
}
