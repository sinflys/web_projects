package constructors;

public class Person {
	private String name;
	private double height;

	// 생성자 메소드 : puclic + 클래스명(), 리턴 타입 없음
	public Person() { // 기본 생성자(생략가능)
		System.out.println("한 사람을 생성!");
	}

	// get set method
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setHeight (double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}

}
