
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Chess_Match {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int testCases,n,a,b;
    
    static void solve(){
        
        long time=2*(180+n);
        
        long ans=time-(a+b);
        
        out.println(ans);
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
        n=in.nextInt();
        a=in.nextInt();
        b=in.nextInt();
            
        solve();
        
        }
        
    }
    
     static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
     }
    
}
/*

3
10 0 2
11 2 1
12 192 192

*/