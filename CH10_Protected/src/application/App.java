package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {

	public static void main(String[] args) {
		//프로텍트protected 접근지정자 사용시 다른 패키지에서 사용할 수 없고 상속받은 자식클래스에서 사용가능
		Fruit  f1 = new Apple();
		//f1.id=7;
		System.out.println(f1.toString());
		
		Fruit  f2 = new Banana();
		//f1.id=7;
		System.out.println(f2.toString());
	}

}
