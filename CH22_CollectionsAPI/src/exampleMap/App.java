package exampleMap;

import java.awt.DisplayMode;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Person{
	//Person의 이름으로 equals메소드를 만들어 key값의 중복을 이름으로 하도록한다.
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
		// 맵을 사용한 예제
		Map<Person, Boolean> people1 = new HashMap<>();
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();
		
		inputMap(people1);
		displayMap(people1);
	}

	private static void displayMap(Map<Person, Boolean> map) {
		// 맵의 키와 value값을 출력한다.
		map.forEach((k,v)->System.out.println(k + " : " + v));
		System.out.println();
	}

	private static void inputMap(Map<Person, Boolean> map) {
		// 맵에 person객체와 boolean을 입력(원격여부)
		map.put(new Person("펭수"), true);
		map.put(new Person("길동"), true);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), false);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), true);
		
	}

}
