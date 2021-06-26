
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HTML_Tags {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int testCases;
    
    static String a;
    
    static void solve(){
        
        if(a.length()<=3){
            
            out.println("Error");
            out.flush();
            
            return;
            
        }
        
        if(a.equalsIgnoreCase("Clearly_Invalid")){
            
            out.println("Error");
            out.flush();
            
            return;
            
        }
        
        int n=a.length();
        
        if( a.startsWith("</") ){
            
            if(!a.endsWith(">")){
                
                out.println("Error");
                out.flush();
             
                return;
                
            }
            
            char ch[]=a.toCharArray();
            
            for(int i=2;i<n-1;i++){
                
              /*  if( Character.isUpperCase(ch[i]) || !Character.isJavaLetterOrDigit(ch[i]) ){
                    
                    out.println("Error");
                    out.flush();
                    
                    return;
                    
                }*/
                
          if( !( (ch[i]>='a' && ch[i]<='z' ) || ( ch[i]>='0' && ch[i]<='9' ) ) ){
              
              out.println("Error");
              out.flush();
              
              return;
              
          }    
              
            }
            
            out.println("Success");
            out.flush();
            
        }else{
            
            out.println("Error");
            out.flush();
            
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            a=in.next().trim();
            
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

5 
</h1>  
Clearly_Invalid  
</singlabharat>  
</5>  
<//aA> 

*/