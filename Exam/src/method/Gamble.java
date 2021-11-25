package method;

public class Gamble {

	public static void main(String[] args) {
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("회득 금액: $%.2f(%.0f원)", dollar,won);
	}
	
	public static int dice() {
		int ran = (int)(Math.random()*6)+1;
		return ran;
	}
	public static double exchange(double dollar) {
		return dollar * 1082.25108;
	}

}
