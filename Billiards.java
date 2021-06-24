
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Billiards {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases;
    static long n;
    
    static long dp[]=new long[1000001];
    
    static long mod=1000000009;
    
    static long solve(long n){
        
        if(n==2 ){
            
            return 1;
            
        }
        
        if(n==3){
            
            return 1;
            
        }
        
        if(n<2){
            
            return 0;
            
        }
        
        if(dp[(int)n]!=0){
            
            return dp[(int)n];
            
        }
        
        long z=solve(n-2)%mod+solve(n-3)%mod;
        
        z=z%mod;
        
        dp[(int)n]=z;
        
        return z;
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextLong();
            
          //  dp=new long[(int)n+1];
            
            out.println( solve(n) );
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
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
    }
    
}
/*

3  
5  
7  
2 

*/