package defaultPac;

public class Flowchart2 {
	
	public static void flow(int a) {
		if(a > 200) {
			return;
		}
		else {
			System.out.println("A");
			flow(a+1);
		}
	}
	
	public static void flow2(int a) {
		if(a > 200) {
			return;
		}
		
		if(a % 2 == 0) {
			System.out.println("-");
		} else {
			System.out.println("*");
		}
		flow2(a + 1);
		
		
	}
	
	public static void printNum() {
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	
	public static void printNumRep() {
		for(int i = 0; i <= 10; i ++) {
			for(int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		flow(100);
		
		flow2(100);
		
		printNum();
		
		printNumRep();
	}

}