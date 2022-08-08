package defaultPac;

public class BlackJack {
	
	public static int play(int x, int y) {
		if(x > 21 && y > 21) {
			return 0;
		}
		else {
			int diffx, diffy = 0;
			diffx = 21 - x;
			diffy = 21 - y; 
			
			if(diffx > diffy && y <= 21) {
				return y;
			}
			else if (x <= 21){
				return x;
			}
			else {
				return 0;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(play(10,21));
		System.out.println(play (20,18));
		System.out.println(play(1, 22));
		System.out.println(play(22,23));
		
	}

}
