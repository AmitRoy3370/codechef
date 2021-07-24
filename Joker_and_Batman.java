
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Joker_and_Batman {

                    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n,m,l;
     
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
    n=in.nextInt();
    m=in.nextInt();
    l=in.nextInt();
      
    Map<Integer,Integer> map=new HashMap<>();
    
    for(int j=0;j<m;j++){
        
        int len=in.nextInt();
         
        for(int i=0;i<len;i++){
            
           map.put(in.nextInt(), j);
            
        }
       
    }
    
    int color[]=new int[l];
    
    for(int i=0;i<l;i++){
        
        color[i]=in.nextInt();
        
    }
    
    int seg=1,prev=map.get(color[0]);
    
    for(int i=1;i<l;i++){
        
        int curr=map.get(color[i]);
        
        if(prev!=curr){
            
            prev=curr;
            
            seg++;
            
        }
        
    }
    
    out.println(seg);
    out.flush();
    
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
2 2 2
1 2
1 1
2 1
2 2 4
1 1
1 2
1 2 2 1
3 2 3
2 1 3
1 2
1 3 1


*/