import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Airline_Restrictions {

       static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases;
    
  static long a,b,c,d,e;
  
  static void solve(){
      
      if( ((a+b)<=d && c<=e) || (( b+c )<=d && a<=e) || ((  a+c )<=d && b<=e) ){
          
          out.println("YES");
          out.flush();
          
      }else{
          
          out.println("NO");
          out.flush();
          
      }
      
  }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            a=in.nextLong();
            b=in.nextLong();
            c=in.nextLong();
            d=in.nextLong();
            e=in.nextLong();
            
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

3
1 1 1 15 5
8 7 6 15 5
8 5 7 15 6


*/