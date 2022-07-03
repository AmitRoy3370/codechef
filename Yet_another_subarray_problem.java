import java.util.Scanner;

public class Yet_another_subarray_problem {
	
	static int testCases, n;
    
	static Scanner in = new Scanner(System.in);
	
    static StringBuilder ans = new StringBuilder();
    
    static void solve(int t) {
        
        StringBuilder tempAns = new StringBuilder();
        
        long number = 1;
        
        for(int i = 0; i < n; ++i) {
            
            tempAns.append(number).append(" ");
            
            number += 2;
            
        }
        
        ans.append(tempAns.toString().trim());
        
        if(t != testCases) {
            
            ans.append("\n");
            
        }
        
    }
    
	public static void main (String[] args) {
	    
	    testCases = in.nextInt();
	    
	    for(int t = 0; t < testCases; ++t) {
	        
	        n = in.nextInt();
	        
	        solve(t + 1);
	        
	    }
		
		System.out.print(ans.toString());
	
	}
	
}