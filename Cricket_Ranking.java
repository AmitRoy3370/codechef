
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Cricket_Ranking {

    
              static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,r1,w1,c1,r2,w2,c2;
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            int a[]=new int[3];
            
            int b[]=new int[3];
            
            a[0]=in.nextInt();
            a[1]=in.nextInt();
            a[2]=in.nextInt();
            
            b[0]=in.nextInt();
            b[1]=in.nextInt();
            b[2]=in.nextInt();
            
            int count=0,count1=0;
            
            for(int i=0;i<3;i++){
                
                if(a[i]>b[i]){
                    
                    count++;
                    
                }else if(a[i]<b[i]){
                    
                    count1++;
                    
                }
                
            }
            
            if(count>count1){
                
                out.println("A");
                out.flush();
                
            }else if(count1>count){
                
                out.println("B");
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

3
0 1 2
2 3 4
10 10 10
8 8 8
10 0 10
0 10 0


*/