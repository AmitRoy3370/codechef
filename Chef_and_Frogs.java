
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chef_and_Frogs {

       static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,p,k;
    
    static Pair a[];
    
    static int dp[];
    
    static class Pair implements Comparable<Pair> {
        
        int element,index;

        public Pair(int element, int index) {
            this.element = element;
            this.index = index;
        }

        @Override
        public int compareTo(Pair t) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        return this.element-t.element;
        
        }
         
    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        k=in.nextInt();
        p=in.nextInt();
        
        a=new Pair[n];
        
        dp=new int[n+1];
        
       for(int i=0;i<n;i++){
           
           a[i]=new Pair(in.nextInt(),i+1);
           
       }
        
       Arrays.sort(a);
       
       int idx=0;
       
       dp[a[0].index]=idx;
       
       for(int i=1;i<n;i++){
           
           if((a[i].element-a[i-1].element)<=k){
               
               dp[a[i].index]=idx;
               
           }else{
               
               dp[a[i].index]=++idx;
               
           }
           
       }
       
       for(int i=0;i<p;i++){
           
           int x=in.nextInt();
           int y=in.nextInt();
           
           if(dp[x]==dp[y]){
               
               out.println("Yes");
               out.flush();
               
           }else{
               
               out.println("No");
               out.flush();
               
           }
           
       }
       
    }
 
     static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader(new InputStreamReader(System.in));
            
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
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
    }
    
}
/*

5 3 3
0 3 8 5 12
1 2
1 3
2 5

*/