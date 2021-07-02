
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class XxOoRr {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n,k;
    
    static long a[];
    
    static void solve(){
        
        long max=a[0];
        
      for(long i: a){
          
          max=Math.max(i,max);
          
      }
      
      int count,term; 
      long ans=0;
      
      long v[]=new long[31];
      
      for(int bit=0;bit<=30;bit++){
          
          count=0;
          
         for(int i=0;i<n;i++){
             
             if(a[i]%2!=0){
                 
                 count++;
                 
             }
             
             a[i]/=2;
             
         }
          
        //  out.println("a: "+Arrays.toString(a));
          //out.flush();
          
          v[bit]=count;
          
      }
      
      for(int i=0;i<=30;i++){
          
          if(v[i]%k==0){
              
              ans+=v[i]/k;
              
          }else{
              
              ans+=(v[i]/k) +1;
              
          }
          
      }
      
      out.println(ans);
      out.flush();
      
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            k=in.nextInt();
            
            a=new long[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextLong();
                
            }
            
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

1
3 2
3 6 10

*/