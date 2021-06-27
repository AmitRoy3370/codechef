
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Cyclic_Quadrilateral {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int testCases,a,b,c,d;

static void solve(){
    
    if( a+c==180 && b+d==180 ){
        
        out.println("YES");
        out.flush();
        
        return;
        
    }
    
  /*  if(a+d==180 && b+c==180){
        
        out.println("YES");
        out.flush();
        
        return;
        
    }
    
    if(a+b==180 && c+d==180){
        
        out.println("YES");
        out.flush();
        
        return;
        
    }*/
    
    out.println("NO");
    out.flush();
    
}
    
    public static void main(String[] args) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=in.nextInt();
        
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
