package defaultPac;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Taxes {
	
	 private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static int taxBracket(int x) {
		if(x < 14999) {
			return 0;
		}
		else if(x < 19999) {
			return 10;
		}
		else if(x < 29999) {
			return 15;
		}
		else if(x < 44999) {
			return 20;
		}
		else {
			return 25;
		}
	}
	
	public static double taxCalc(int sal) {
		double tax = 0, temp = 0;
		double taxBra = Double.valueOf(taxBracket(sal));
		
		//no tax
		if(taxBra == 0) {
			tax = 0;
		}
		//no tax to 14999, then 10%
		else if(taxBra == 10) {
			temp = sal - 14999;
			tax = 0;
			tax = tax + (temp * (taxBra / 100));
		}
		//no tax to 14999, then 10% to 19999 which is always 500 (5000 * 0.1)
		else if(taxBra == 15) {
			temp = sal - 19999;
			tax = 500;
			tax = tax + (temp * (taxBra / 100));
		}
		
		//no tax to 14999, then 10% to 19999 (£500) then 15% to 29999 which is always £1,500 (10000 * 0.15)
		else if(taxBra == 20) {
			temp = sal - 29999;
			tax = 500 + 1500;
			tax = tax + (temp * (taxBra / 100));
		}
		
		//no tax to 14999, then 10% to 19999 (£500) then 15% to 29999 (£1,500) then 20% to 44999 which is always 
		//£3.000 (1500 * 0.2)
		
		else {
			temp = sal - 44999;
			tax = 500 + 1500 + 3000;
			tax = tax + (temp * (taxBra / 100));
			
		}
		
		
		
		
		
		
		return tax;
	}
	
	public static void main(String[] args) {
		System.out.println("£" + df.format(taxCalc(30000)));
		
	}

}