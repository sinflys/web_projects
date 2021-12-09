package example;

public class Split_String {
	public static void main(String[] args) {
		// split() 문자열 쪼개서 배열로 리턴
		String text1 = "Mounting evidence highlights the importance of Covid-19 boosters";
		String text2 = "첫 문·이과 통합형으로 치러진 올해 대학수학능력시험(수능)에서 전 영역 만점자는 사회탐구 영역을 선택한 인문계열 졸업생 1명인 것으로 나타났다."
				+ "강태중 한국교육과정평가원장은 9일 정부세종청사에서 열린 '2022학년도 수능 채점 결과 발표' 브리핑에서 이같이 밝혔다.";
		
		//String[] words = text1.split("[^a-zA-Z]+"); //정규표현식 영문철자를 제외한 특수문자 스페이스 점 슬래시같은 것들을 제외하고 단어만 리턴
		String[] words = text2.split("[^가-힣]+");
		
		for(String w : words) {
			if(w.length() < 3) { // 철자가 2개 이하는 제외
				continue;
			}
			System.out.println(w.toLowerCase()); //소문자로 변환해서 출력
		}
	}

}
