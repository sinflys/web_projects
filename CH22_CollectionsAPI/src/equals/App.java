package equals;

class Person {
	private String name;	
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		// 같은지 비교하는 메소드
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}
