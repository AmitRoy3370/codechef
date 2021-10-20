import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Chef_and_Magical_Steps{
		
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,x,y;
	
	static boolean prime[]=new boolean[11111111+1];
	
	static long count[]=new long[11111111+1];
	
	static StringBuilder finalAns=new StringBuilder();
	
	static void solve(){
		
		if((x==1 && y==2)  ){
			
			//out.println(2);
			//out.flush();
			
			finalAns.append( 1 ).append("\n");
			
			return;
			
		}
		
		if(x==1 && y==3){
			
			finalAns.append(2).append("\n");
			
			return;
			
		}
		
		if(x==2 && y==3){
			
			finalAns.append(1).append("\n");
			
			return;
			
		}
		
		/*long ans=y-x;
		
		ans=ans- (count[y]-count[x]);
		
		if( !prime[x+1] ){
			
			++ans;
			
		}
		
		out.println(ans);
		out.flush();*/
		
		long ans=0;
		
	  long count1=0;
      long p1=count[x+1];
      long p2=count[y];
      long to=p2-p1;
      
      count1=(y-x)-to;
		
	//	out.println(ans);
		//out.flush();
		
		ans=count1;
		
		finalAns.append(ans).append("\n");
		
	}

	public static void main(String [] amit) throws IOException{
		
		testCases=in.nextInt();
		
		seive();
		
		for(int t=0;t<testCases;t++){
			
			x=in.nextInt();
			
			y=in.nextInt();
			
			solve();
		
		}
		
		in.close();
		
		out.print(finalAns);
		out.flush();
		
	}
	
	static void seive(){
		
		prime[0]=true;
		prime[1]=true;
		
		for(int i=2;i*i<=11111111;i++){
			
			if( !prime[i] ){
				
				for(int j=i*2;j<=11111111;j+=i){
					
					prime[j]=true;
					
				}
				
			}
			
		}
		
		for(int i=2;i<=11111111;i++){
			
			count[i]=count[i-1]+(prime[i]==true?0:1);
			
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
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
        
        boolean nextBoolean() throws IOException{
            
            return Boolean.parseBoolean(next());
            
        }
        	
        void close() throws IOException{
            
            in.close();
            
        }
        
    }
	
}