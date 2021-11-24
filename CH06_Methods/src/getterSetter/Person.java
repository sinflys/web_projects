package getterSetter;

public class Person {
	//private는 같은 클래스에서만 접근 가능
	private String name;
	private int age;
	
	//public은 다른 클래스에서 쓸수 있음
	public void setName(String name) {
		this.name = name; //이때 this는 인스턴스의미
	}
	
	//get메소드는 값을 리턴하는 메소드
	public String getname() {
		return name;
	}
	
	// set get age 만들기
	public void setage(int age) {
		System.out.println(this);
		this.age = age;
	}
	
	public int getage() {
		System.out.println(this);
		return age;
	}
}
