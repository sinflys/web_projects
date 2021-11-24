package constructorsParameter;

public class Person {
	private String name;
	private double height;

	// public Person() {} //기본생성자(생략가능)
	// 생성자 메소드 : puclic + 클래스명(), 리턴 타입 없음
	public Person() {
		name = "익명";
		height = 170;
		System.out.println("한 사람을 생성!");
	}

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("한 사람을 생성!");
	}
	// toString 메소드
	public String toSrting() {
		String text = "이름 : " + name + " 키 : " + height;
		return text;
	}
	// get set method
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

}
