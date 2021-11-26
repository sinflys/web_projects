package overridingMethod;

public class HouseCat extends Cat {
	@Override //어노테이션 오버라이드
	public void vocal() {
		System.out.println("미야우~");
	}

}
