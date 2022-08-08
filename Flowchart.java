package defaultPac;

public class Flowchart {
	
	public static int input(int x, int y, boolean z) {
		if(z == true) {
			return x + y;
		}
		else {
			return x * y;
		}
	}
	
	public static void flow (int A) {
		if(A > 2000) {
			System.out.println("A");
			if(A > 6000) {
				System.out.println("C");
			}
			else if(A > 4000) {
				System.out.println("B");
				System.out.println("D");
			}
			else {
				System.out.println("B");
				System.out.println("E");
			}
		}
		else {
			System.out.println("1");
			if(A > 100) {
				System.out.println("3");
				if(A > 600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if(A > 500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			}
			else {
				System.out.println("2");
			}
		}
	}
	
	public static void main(String[] args) {
		flow(1999);
		
		
	}

}
