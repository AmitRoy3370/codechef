
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Chess_Format {

         static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int a,b,testCases;
    
    public static void main(String[] amit) throws IOException {
        
    testCases=in.nextInt();
        
    for(int t=0;t<testCases;t++){
        
        a=in.nextInt();
        
        b=in.nextInt();
        
        if(a+b<3){
            
            out.println("1");
            out.flush();
            
        }else if(3<=(a+b) && (a+b)<=10){
            
            out.println(2);
            out.flush();
            
        }else if( 11<=a+b && a+b<=60 ){
            
            out.println(3);
            out.flush();
            
        }else if(a+b>60){
            
            out.println(4);
            out.flush();
            
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

4
1 0
4 1
100 0
20 5


*/