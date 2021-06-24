import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Count_K_Primes{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int testCases,a,N=100001,b,k;
	
	static long prime[]=new long[100001];
	
	static long ans[][]=new long[6][N];
	
	static void seive(){
		
		for(int i=1;i<N;i++){
			
			int x=i;
			
			for(int j=2;j*j<=x;j++){
				
				
				if(x%j==0){
					
					while(x%j==0){
						
						x/=j;
						
					}
					
					prime[i]=prime[x]+1;
			
x=1;
			
					break;
					
				}
				
			}
			
			if(x>1){
				
				prime[i]=1;
				
			}
			
		}
		
		for(int i=1;i<N;i++){
			
			for(int j=1;j<=5;j++){
				
				if(prime[i]==j){
					
					ans[j][i]=ans[j][i-1]+1;
					
				}else{
					
					ans[j][i]=ans[j][i-1];
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] amit) throws IOException{
		
		testCases=in.nextInt();
	
seive();
	
		for(int t=0;t<testCases;t++){
			
			String s[]=in.nextLine().split(" ");
			
			a=Integer.parseInt( s[0] );
			b=Integer.parseInt(s[1]);
			k=Integer.parseInt(s[2]);
			
			out.println( ans[k][b]-ans[k][a-1] );
			out.flush();
			
		}
		
	}
	
	static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer( in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
    }
	
}