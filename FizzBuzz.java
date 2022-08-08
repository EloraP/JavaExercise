package defaultPac;

public class FizzBuzz {
	
	public static String check(int x) {
		
		if(x%3 == 0) {
			if(x%5 == 0) {
				return "FizzBuzz";
			}
			else {
				return "Fizz";
			}
		}
		else if(x%5==0) {
			return "Buzz";
		}
		
		return String.valueOf(x);
		
	}
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 17; i++) {
			System.out.println(check(i));
		}
		
	}

}
