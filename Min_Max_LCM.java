import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Min_Max_LCM {
	
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases;
    
    static long x,k;
    
    static void solve(){
        
 //       out.println( ((x*2*x)/((gcd(x,2*x)==0?1:gcd(x,2*x)) ))+" "+(((k-1)*k)/(gcd(k-1,k)==0?1:gcd(k-1,k)) ) );
   //     out.flush();
     
long len=x*k;

out.println( (x*2)+" "+(len*(len-1)) );
out.flush();

    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            x=in.nextLong();
            
            k=in.nextLong();
            
      //      k=x*k;
            
            solve();
            
        }
        
        in.close();
        
    }
    
    static long gcd(long a, long b)   
{   
  
if (a == 0)   
return b;   
if (b == 0)   
return a;   
if (a == b)   
return a;   
if (a > b)   
return gcd(a-b, b);   
return gcd(a, b-a);   
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

2
4 3
2 3


*/