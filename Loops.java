package defaultPac;

public class Loops {
	
	public static String[] strArray = {
			"the",
			"quick", 
			"brown",
			"fox",
			"jumped",
			"over",
			"the",
			"lazy",
			"sleeping",
			"dogs"
	};
	
	public static int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	
	public static boolean isEven(int x) {
		
		if(x%2 == 0) {
			return true;
		}

		
		return false;
	}
	public static void main(String[] args) {
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println();
		
		for(int intOut: intArray) {
			if(isEven(intOut)) {
				System.out.println(intOut * intOut * intOut);
			}else {
				System.out.println(intOut * intOut);
			}
		}
		
		
		
	}

}
