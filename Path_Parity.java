import java.util.Scanner;

public class Path_Parity {
	
	static Scanner in = new Scanner(System.in);
	
	static int testCases;
	
	static long n, k;
	
	static void solve() {
		
		if(n % 2 == 0) {
			
			System.out.println("Yes");
			
		} else {
			
			if(k == 1) {
				
				System.out.println("Yes");
				
			} else {
				
				System.out.println("No");
				
			}
			
		}
		
	}
	
	public static void main(String [] amit) {
		
		testCases = in.nextInt();
		
		for(int t = 0; t < testCases; ++t) {
			
			n = in.nextLong();
			k = in.nextLong();
			solve();
			
		}
		
	}
	
}