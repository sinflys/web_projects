package interfaces;

public class App {

	public static void main(String[] args) {
		// 인터페이스
		// Describable ds = new Describable()
		Describable[] objs = { new Person(), new Computer() };
		
		for(Describable obj : objs) {
			System.out.println(obj.getDescription());
		}

	}

}
