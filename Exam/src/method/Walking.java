package method;

public class Walking {

	public static void main(String[] args) {
		double Cal = calculateCalory(5000);
		System.out.println("소모 칼로리: " + Cal + "kcal");
		}
		
		private static double calculateCalory(int walk) {
			double result = walk * 0.02;
			return result;
		}

}
