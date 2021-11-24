package getterSetter;

public class App {

	public static void main(String[] args) {
		// 인스턴스 변수에 접근하는 메소드 get 과 set
		Person p1 = new Person();
		//보안상 객체의 변수에 바로 접근하지 못함
		//p1.name = "펭수";
		
		p1.setName("펭수");
		System.out.println(p1.getname());
		p1.setage(25);
		System.out.println(p1.getage());
		
		Person p2 = new Person();
		
		p2.setName("길동");
		System.out.println(p2.getname());
		p2.setage(17);
		System.out.println(p2.getage());

	}

}
