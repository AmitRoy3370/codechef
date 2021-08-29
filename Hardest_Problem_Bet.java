
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Hardest_Problem_Bet {

       static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases,n;
    
  static int a[];
    
  static void solve(){
      
      if( a[0]<=a[1] && a[0]<=a[2] ){
          
          out.println("Draw");
          out.flush();
          
      }else if( a[1]<=a[0] && a[1]<=a[2] ){
          
          out.println("Bob");
          out.flush();
          
      }else if( a[2]<=a[1] && a[2]<=a[0] ) {
          
          out.println("Alice");
          out.flush();
          
      }
      
  }
  
    public static void main(String[] amit) throws IOException {
        
      testCases=in.nextInt();
        
      for(int t=0;t<testCases;t++){
          
          a=new int[3];
          
          for(int i=0;i<3;i++){
              
              a[i]=in.nextInt();
              
          }
          
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
1 4 2
16 8 10
14 15 9


*/