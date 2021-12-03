package custom_execption;

import custom_execption.exceptions.TempTooHighException;
import custom_execption.exceptions.TempTooLowException;

public class App {
	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(36);
		} catch (TempTooHighException e) {
			//온도가 높을때
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			//온도가 낮을때
			System.out.println(e.getMessage());
		}
	}
}