
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Chef_and_Bulb_Invention {

        static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int testCases;
    
    static long n,p,k;
    
    static void solve(){
        
        int ans=0;
        
        long q=p%k;
        
        q--;
        
        long s=( (n-1)/k )*k;
        
        s=n-1-s;
        
        if(q>s){
            
            ans+=(s+1)*( (n-1)/k+1 )+(q-s)*( (n-1)/k );
            
        }else{
            
            ans+=( (n-1)/k+1 )*(q+1);
            
        }
        
        for(long i=q+1;i<=n-1;i+=k){
            
            ans++;
            
            if(i==p){
                
                out.println(ans);
                out.flush();
                
                return;
                
            }
            
        }
        
    }
           
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextLong();
            p=in.nextLong();
            k=in.nextLong();
            
            solve();
            
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

4
10 5 5
10 6 5
10 4 5
10 8 5


*/