package defaultPac;



public class Strings {
	
	public static String str1 = "yesterday it was raining";
	public static String str2 = "   today     it     is    sunny        ";
	public static String str3 = "ty";
	
	
	public static String removeDoubSpace(String input) {
		
		String output = "";
		
		if(input == " ") {
			return " ";
		}
		
		for(int i = 0; i < input.length(); i++) {
			if(i == input.length() - 1) {
				if(input.charAt(i - 1) == ' ' && input.charAt(i) == ' ') {
					
				}else {
					output = output.concat(Character.toString(input.charAt(i)));
				}
				
			} else if (input.charAt(i) == ' ' && input.charAt(i + 1) == ' ') {
				
			}else {
				output = output.concat(Character.toString(input.charAt(i)));
			}
		}
		
		return output;
	}
	
	public static int count(String input) {
		
		int len = input.length(), count = 1;
		boolean empty = true;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ') {
				count++;
			}else {
				empty = false;
			}
		}
		
		if(empty) {
			count = 0;
		}
		
		return count;
	}
	
	public static int countWord(String input) {
		String newInput = removeDoubSpace(input);
		return count(newInput);
	}

	public static void printWordVert(String input) {
		String output = removeDoubSpace(input), word = ""; 
		
		System.out.println(output);
		for(int i = 0; i < output.length(); i++) {
			if(output.charAt(i) == ' ') {
				System.out.println(word);
				word = "";
			}
			else {
				word = word.concat(Character.toString(output.charAt(i)));
			}
		}
	}
	
	
	public static boolean inWord(String message, String find) {
		
		boolean result = false; 
		
		for(int i = 0; i < message.length(); i++) {
			for(int j = i; j < message.length(); j++) {
				
				//if(i < j) {
					System.out.println(message.substring(i, j) + ": " + find);
					if(message.substring(i, j).equals(find)) {
							result = true;
						}
					//}
				}
			}			
		
		
		
		
		return result;
	}
	
	public static void printVert(String input) {
		
		for(int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String output; 
		
		output = str1.toUpperCase().concat(", " + str2.toUpperCase());
		System.out.println(output);
		
		output = output.substring(0, 24);
		System.out.println(output);
		
		printWordVert(str1);
		
		System.out.println(inWord(str2, str3));
		
	}
}
