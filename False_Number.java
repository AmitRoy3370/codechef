
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class False_Number {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int testCases;
    
    static String a;
    
    static void solve(){
         
        char []ch=a.toCharArray();
        
        int n=ch.length;
        
        if(ch[0]=='1'){
            
            StringBuilder sb=new StringBuilder();
            
            sb.append(ch[0]).append('0');
            
            for(int i=1;i<n;i++){
                
                sb.append(ch[i]);
                
            }
            
            out.println(sb.toString());
            out.flush();
            
        }else{
            
            StringBuilder sb=new StringBuilder();
            
            sb.append('1');
            
            sb.append(a);
            
            out.println(sb.toString());
            out.flush();
                    
        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            a=in.next();
            
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

2
9876543211
12345678999

*/