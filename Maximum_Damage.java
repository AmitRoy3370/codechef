import java.util.Scanner;

public class Maximum_Damage{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static long a[];
	
	static void solve(){
		
		StringBuilder ans=new StringBuilder();
		
		ans.append( a[0]&a[1] ).append(" ");
		
		for(int i=1;i<n-1;i++){
			
			ans.append( Math.max( a[i]&a[i-1],a[i]&a[i+1] ) ).append(" ");
			
		}
		
		ans.append( a[n-1]&a[n-2] );
		
		System.out.println(ans);
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=new long[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextLong();
				
			}
			
			solve();
			
		}
		
	}
	
}