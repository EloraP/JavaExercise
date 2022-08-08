package defaultPac;

public class UniqueSum {
	
	public static int uniqueSum(int x, int y, int z) {
		if(x == y) {
			if(x == z) {
				return 0;
			}
			else {
				return z;
			}
		}
		else if(x == z) {
			return y;
		}
		else if(y == z) {
			return x;
		}
		else {
			return x + y + z;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(uniqueSum(1, 2, 3));
		System.out.println(uniqueSum(3, 3, 3));
		System.out.println(uniqueSum(1, 1, 2));
		
	}

}