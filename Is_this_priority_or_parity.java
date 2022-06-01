import java.util.Scanner;

public class Is_this_priority_or_parity {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String [] amit) {
		
		int testCases = in.nextInt();
		
		for(int t = 0; t < testCases; ++t) {
			
			long x = in.nextLong();
			long y = in.nextLong();
			
			if(y > x) {
				
				System.out.println((y - x));
				
			} else {
				
				if(x % 2 == y % 2) {
					
					System.out.println((x - y) / 2);
					
				} else if(x % 2 != y % 2){
					
					System.out.println((((x + 1 - y) / 2) + 1));
					
				}
				
			}
			
		}
		
	}
	
}