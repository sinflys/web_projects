package innerClasses;

public class App implements Runnable {
	
	private String name = "미키 마우스";

	public static void main(String[] args) {
		new App().start();
	}

	private void start() {
		//activate 메소드를 사용해서 이너클래스 들로 실행방법
		//1. App 에 인터페이스 Runnable를 구현해서 실행
		activate(this);
		//2. 익명클래스
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
		//3. 메소드 이너 클래스
		class Runner1 implements Runnable {
			public void run() {
				System.out.println(name);
			}
		}
		activate(new Runner1());
		
	}
	
	public void activate(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void run() {
		System.out.println(name);
		
	}
	

}
