package ch12.sec03.ex02;

import java.util.Objects;

public class Student {
	private int no;
	private String name;
	
	public Student() {}
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Collections API 를 올바르게 사용하기 위해서 overriding 해주자!
	@Override
	public int hashCode() {
//		return no + name.hashCode();
		return Objects.hash(no, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
}