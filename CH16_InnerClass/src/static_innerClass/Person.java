package static_innerClass;

public class Person {
	class Head{
		public void print() {
			System.out.println("Head");
		}
	}
	
	static class Body {
		public void print() {
			System.out.println("Body");
		}
	}
	
	public void print() {
		Head head = new Head();
		Body body = new Body();
		// 내부 클래스는 클래스 안에서 객체를 만들어 사용하면 쉽게 사용
		head.print();
		body.print();
	}
}
