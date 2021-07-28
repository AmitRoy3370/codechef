
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Mod_Equality {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n;
    static long a[];
    
    static void solve(){
        
        int minIndex=0;
        
        long min=a[0];
        
        boolean res=false;
        
        for(int i=1;i<n;i++){
            
            if( a[i]<min){
                
                min=a[i];
                
                minIndex=i;
                
            }
            
        }
        
        long ans=0;
        
        for(long i: a){
            
            if( i==min ){
                
                continue;
                
            }
            
            long chg=i%(i-min);
            
            if(chg==min){
                
                ans++;
                
            }else{
            
             min=0;   
                
            res=true;
            
            ans=0;
            break;
            
            }
            
        }
        
        if(res){
        
        for(long i: a){
            
            if(i!=0){
                
                ans++;
                
            }
            
        }
        
        }
        
        out.println(ans);
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
3
2 1 3
3
1 1 3


*/