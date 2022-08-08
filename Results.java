package defaultPac;
import java.lang.Object;
import java.lang.String;

public class Results {
	static int phy, bio, chem, total = 0;

	public static void resTable() {
		total = phy + bio + chem;
		System.out.println("Physics Mark: " + phy + ".");
		System.out.println("Biology Mark: " + bio + ".");
		System.out.println("Chemistry Mark: " + chem + ".");
		
		System.out.println("Total Mark: " + total + "." );	
		
	}
	
	public static void percentage() {
		double per = total/450.00 * 100.00;
		System.out.println(total);
		System.out.println("Overal Percentage: \t" + per + "%.");
		
	}
	
	
	public static void main(String[] args) {
		phy = 10;
		bio = 42;
		chem = 59;
		
		resTable();
		percentage();
		
	}
}
