package methodchain.team01;

public class Member {
	private int height;
	private int weight;
	
	public Member setHeight(int height) {
		this.height = height;
		return this;
	}
	public Member setWeight(int weight) {
		this.weight = weight;
		return this;
	}
	
	public String compare(Member other) {
		if (this.height > other.height && this.weight > other.weight) {
			return "내가 더 크고 무겁습니다.";
		} else if (this.height > other.height && this.weight > other.weight) {
			return "상대가 더 크고 무겁습니다.";
		} else {
			return "비슷합니다.";
		}
	}
	
	
}
