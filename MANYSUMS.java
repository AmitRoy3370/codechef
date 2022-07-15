import java.util.Scanner;

class Codechef
{
    
    static Scanner in = new Scanner(System.in);
    
    static int testCases, L, R;
    
    /*
    
    1 2 3 4 5 -> (1, 1), (2, 2), (3, 3), (4, 4), (5, 5), (1, 2), (5, 4), (3, 4), (2, 3)
    
    - common pair is the number ownself. that number is R - L + 1
      this create the even number till 1 to n + n. eg. (1 + 1) = 2,
      (2 + 2) = 4, (3 + 3) = 6, (4 + 4) = 8, (5 + 5) = 10, So according to this perspective we do not take any number that is even created by the even + even and odd + odd pair.
    - another pair here can be created. This is for the odd  numbers.
      so here some odd number will added for the some even number. So we think that again (R - L) numbers will be added at here.
    - So our total number is at here (R - L + 1) + (R - L) = 2 * R - 2 * L + 1. So this number of numbers we can added at here.   
    
    */
    
    static void solve() {
        
        long ans = 2 * R - 2 * L + 1; // for every individual number
        
        System.out.println(ans);
        
    }
    
	public static void main (String[] args) 
	{
		
		testCases = in.nextInt();
		
		for(int t = 0; t < testCases; ++t) {
		    
		    L = in.nextInt();
		    R = in.nextInt();
		    
		    solve();
		    
		}
		
	}
}
