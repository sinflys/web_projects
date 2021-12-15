package lambda_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceAll {

	public static void main(String[] args) {
		// 리스트의 값을 연산결과로 대체한다.
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		
		numbers.replaceAll(n -> n*n);
		
		numbers.forEach(n -> System.out.println(n));
		
		List<String> firends = new ArrayList<>();
		firends.add("펭수");
		firends.add("길동");
		firends.add("메리");
		firends.add("철수");
		
		firends.replaceAll(s -> "안녕~ " + s);
		firends.forEach(s -> System.out.println(s));
	}

}
