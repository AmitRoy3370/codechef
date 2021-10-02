
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MEX_OR {
  static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int testCases;
    
    static long n;
    
    static void solve(){
        
        if(n==0){
            
            out.println(1);
            out.flush();
            
        }else if(n==2 || n==1 ){
            
            out.println(2);
            
        }else if( (n|(n-1))==0 ){
            
            out.println(n);
            out.flush();
       
        }else{
            
            long ans=1;
            
            while( 2*ans<=n ){
                
                ans*=2;
                
            }
            
            if(ans==n){
                
                out.println(ans);
                out.flush();
                
            }
            
           else if(n==(2*ans-1)){
                
                out.println(n+1);
                out.flush();
                
            }else{
                
                out.println(ans);
                out.flush();
                
            }
            
        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextLong();
            
            solve();
            
        }
        
        in.close();
        
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
/*

4
0
1
2
5


*/