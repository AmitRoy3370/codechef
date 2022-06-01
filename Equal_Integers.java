import java.util.Scanner;

public class Equal_Integers {
	
	static Scanner in = new Scanner(System.in);
	
	static long testCases;
	
	static long x, y;
	
	static void solve() {
		
		if(y == 1) {
			
			System.out.println((x % 2 == 0 ? "EVEN" : "ODD") );
			
		} else {
			
			System.out.println((y == 2 ? "ODD" : "EVEN"));
			
		}
		
	}
	
	public static void main(String [] amit) {
		
		testCases = in.nextInt();
		
		for(int t = 0; t < testCases; ++t) {
			
			x = in.nextLong();
			y = in.nextLong();
			
			solve();
			
		}
		
	}
	
}