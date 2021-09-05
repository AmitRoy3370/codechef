import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Minimize_Digit_Sum {

         static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases;
  static long n,l,r,ans=Integer.MAX_VALUE;
    
  static long sum(long n,long base){
      
      long sum=0;
      
      while(n>0){
          
          sum+=n%base;
          
          if(sum>ans){
              
              break;
              
          }
          
          n/=base;
          
      }
      
      return sum;
      
  }
  
  static void solve(){
      
       ans=Long.MAX_VALUE;
      
      long base=-1;
      
      for(long i=l;i<=r;i++){
          
          if(r>=n && n%i==0){
              
              out.println(i);
              out.flush();
              
              return;
              
          }
          
          long sum=sum(n,i);
          
          if(sum<=ans){
              
              ans=sum;
              
              base=i;
              
          }
          
          if(ans==1){
              
              break;
              
          }
          
      }
      
      out.println(base);
      out.flush();
      
  }
  
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextLong();
            
            l=in.nextLong();
            
            r=in.nextLong();
            
            if(r>=n){
                
                out.println(r);
                out.flush();
                
            }else if(l<n && n<r){
                
                out.println(n);
                out.flush();
                
            }else{
            
            solve();
            
            }
            
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
/*

3
216 2 7
256 2 4
31 3 5


*/