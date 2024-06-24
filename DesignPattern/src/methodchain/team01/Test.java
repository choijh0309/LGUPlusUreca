package methodchain.team01;

public class Test {

	public static void main(String[] args) {
		Member member1 = new Member();
		Member member2 = new Member();
		
		member1.setHeight(180).setWeight(80);
		member2.setHeight(170).setWeight(70);
		
		String comparisonResult = member1.compare(member2);
        System.out.println(comparisonResult);
	}

}
