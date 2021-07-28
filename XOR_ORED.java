
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class XOR_ORED {

    
    
               static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n;
    static long a[];
    
    static void solve(){
        
        /*long bitX[][]=new long[n][32];
        long bitY[][]=new long[n][32];
        
        for(int i=0;i<32;i++){
            
            for(int j=0;j<n;j++){
                
                if(a[j]%2==1){
                    
                    bitX[j][i]=1;
                    
                }
                
                a[j]/=2;
                
            }
            
        }
        
        long x1,x2,y1;
        
        for(int i=0;i<32;i++){
            
            for(int j=0;j<n-1;j++){
                
            x1=bitX[j][i];    
            x2=bitX[j+1][i];    
            y1=bitY[j][i];
            
            if(y1==1){
                
                if(x1==0 && x2==0 ){
                    
                    bitY[j+1][i]=1;
                    
                }
                
            }else{
                
                if(x1==1 && x2==0 ){
                    
                    bitY[j+1][i]=1;
                    
                }
                
            }
            
            }
            
        }*/
        
        long b[]=new long[n];
        
        for(int i=0;i<n;i++){
            
            b[i]=a[i];
            
        }
        
        long nSetBits[]=new long[32];
        
        for(int i=0;i<32;i++){
            
            for(int j=0;j<n;j++){
                
                if(a[j]%2!=0){
                    
                    nSetBits[i]++;
                    
                }
                
                a[j]/=2;
                
            }
            
        }
        
        long ans=0,term=1;
        
        for(int i=0;i<32;i++){
            
            if( nSetBits[i]>=n-nSetBits[i] ){
                
                ans+=term;
                
                
            }
            
            term*=2;
            
        }
        
        int arror=0;
        
        for(long i: b){
            
            arror |=(i^ans);
            
        }
        
        out.println(ans+" "+arror);
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

1
2
4 6


*/