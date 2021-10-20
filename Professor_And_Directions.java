import java.util.Scanner;

public class Professor_And_Directions {
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static char a[];
	
	static void solve(){
		
		for(int i=0;i<n-1;i++){
			
			if( a[i]==a[i+1] ){
				
				System.out.println("YES");
				
				return;
				
			}
			
		}
		
		System.out.println("NO");
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=in.next().toCharArray();
			
			solve();
			
		}
		
	}
	
}