import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Shuffling_Parities {

      static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases,n;
    
  static long a[];
  
  static void solve(){
      
      int oddIndex=0,evenIndex=1;
      
      while(true){
          
          while( evenIndex<n && a[evenIndex]%2==1 ){
              
              evenIndex+=2;
              
          }
          
           while( oddIndex<n && a[oddIndex]%2==0 ){
              
              oddIndex+=2;
              
          }
          
           if( evenIndex<n && oddIndex<n ){
               
               long temp=a[evenIndex];
               a[evenIndex]=a[oddIndex];
                a[oddIndex]=temp;
            
           }else{
               
               break;
               
           }
           
      }
          
      long sum=0;
      
      for(int i=0;i<n;i++){
          
         sum+=(a[i]+ (i+1) )%2;
          
      }
      
      out.println(sum);
      out.flush();
      
  }
  
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextLong();
                
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
3
1 2 3
3
2 4 5
2
2 4


*/

/*

1
3
1 2 3

*/

/*

1
3
2 4 5

*/