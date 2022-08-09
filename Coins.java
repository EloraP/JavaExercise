package defaultPac;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Coins {
	
	 private static final DecimalFormat df = new DecimalFormat("0.00");
	
	
	public static void change(double amount, double payment) {
		double change = payment - amount;
		//double fifties = 0, twenties = 0, tens = 0, fives = 0, ones = 0, fiftyP = 0, twentyP = 0, tenP = 0, fiveP = 0, twoP = 0, oneP = 0;
		double notesAndCoins[] = {50, 20, 10, 5, 1, 0.50, 0.2, 0.1, 0.05, 0.02, 0.01};
		int changeArray[] = new int[11];
		
		
		for(int i = 0; i < notesAndCoins.length; i++) {
			while(change >= notesAndCoins[i]) {
				change = change - notesAndCoins[i];
				changeArray[i]++;
			}
			
		}
		
		for(int i = 0; i < changeArray.length; i++) {
			System.out.println("£" + df.format(notesAndCoins[i]) + ": " + changeArray[i]);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		change(10.50, 20);
		
		
	}

}