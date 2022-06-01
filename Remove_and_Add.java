import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Remove_and_Add  {
	
	static Scanner in = new Scanner(System.in);
	
	static int n, testCases;
	
	static long a[];
	
	static void solve() {
		
		Map<Long, Integer> map = new HashMap<>();
		
		int r = n - 1, j = 0;
		long ans = n;
		
		for(int i = 0; i < n; ++i) {
			
		    r = n - i - 1;
		   
		    int temp = (map.containsKey(a[i]) ? map.get(a[i]) : 0);
		   
		    j = Math.max(j, temp);
			
			map.put(a[i], i + 1);
			
			ans = Math.min(ans, Math.min(j, r) + j + r);
			
		}
		
		System.out.println(ans);
		
	}
	
	public static void main(String [] amit) {
		
		testCases = in.nextInt();
		
		for(int t = 0; t < testCases; ++t) {
			
			n = in.nextInt();
			
			a = new long[n];
			
			for(int i = 0; i < n; ++i) {
				
				a[i] = in.nextLong();
				
			}
			
			solve();
			
		}
		
	}
	
}