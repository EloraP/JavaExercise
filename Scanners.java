package defaultPac;
import java.util.Scanner;

public class Scanners {
	
	public static boolean checkLeap(int year) {
		
		if(year%100 == 0 & year%400 == 0) {
			return true;
		}
		else if(year%4 == 0) {
			return true;
		}
		return false;
	}
	
	
	public static void placeOfService(char sex, char marry, int age) {
		if(sex == 'F') {
			System.out.println("Work in Urban Areas");
			
		}
		else if(sex == 'M' & age < 40 & age > 20) {
			System.out.println("Work Anywhere");
		}
		else if(sex == 'M' & age > 40 & age < 60) {
			System.out.println("Work in Urban Areas");
			
		}
		else {
			System.out.println("ERROR");
		}
	}
	
	public static void returnRev(int[] input) {
		
		int[] output = new int[input.length];
		int len = input.length - 1;
		
		
		for(int i = 0; i < input.length; i++) {
			output[len] = input[i];
			len--;
		}
		
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input =  scan.nextLine();
		
		try {
			int d = Integer.parseInt(input);
			
			String temp = input;
			int[] newGuess = new int[temp.length()];
			for (int i = 0; i < temp.length(); i++)
			{
			    newGuess[i] = temp.charAt(i) - '0';
			}
			
			returnRev(newGuess);
			
		}
		catch(NumberFormatException nfe) {
			System.out.println("Invalid input");
		}
		
	}

}