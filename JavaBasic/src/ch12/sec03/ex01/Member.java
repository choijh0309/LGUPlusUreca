package ch12.sec03.ex01;

import java.util.Objects;

// == 와 equals() 분리
public class Member extends Object {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // Member 클래스의 객체 확인
			Member target = (Member) obj; // Member 강제 형 변환
			
//			if (this.id.equals(target.id)) {
//				return true;
//			}
			
			return Objects.equals(this.id, target.id);
		}
		return false;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Member other = (Member) obj;
//		return Objects.equals(id, other.id); // Objects 가 생김
//	}

}
